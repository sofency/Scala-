package com.sofency.top

import scala.jdk.Accumulator

/**
 * @author sofency
 * @date 2020/10/8 11:06
 * @package IntelliJ IDEA
 * @description
 */

class Test{
  def m(x:Int) = x+3
  val f = (x:Int) => x+3
}
object TestMethodAndFunc {
  //定义方法
  def add(x:Int,y:Int): Int ={
    return x+y
  }

  def main(args: Array[String]): Unit = {
    delayed(time())//传名调用  即每调用一次函数的名字就执行一次函数
    printString("alice","so","fency")
    println("递归函数")
    println(factorial(5));
    println(addInt(1));//不用传参数
    println("高级函数")
    println(apply(layout,10,10));
    println("嵌套函数 累加因子 accumulator")
    println(fractional(0))
    println(fractional(1))
    println(fractional(2))
    println(fractional(3))

    println("匿名函数")
    val fa = 4;
    println("闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。multi依赖于外部变量 fa")
    val multi = (i:Int) => i*fa;
    println(multi(3))

    println("函数柯西化")

    println(addNum(1)(2))
    println(addNumber(1)(20))
  }

  def addNum(x:Int)(y:Int)=x+y

  def addNumber(x:Int)=(y:Int)=>x+y
  def time() = {
    println("获取时间,单位位纳秒")
    //不需要写return
    System.nanoTime()
  }

  def delayed(t: =>Long)={
    println("在delayed方法内部")
    println("参数是"+t)
    t
  }


  //可变参数
  def printString(args:String*): Unit ={
     var i:Int = 0
    println("可变参数 加上*")
     for(arg <- args){
       println("args["+i+"]="+arg)
       i+=1
     }
  }

  //递归函数
  def factorial(n:BigInt):BigInt={
    if(n<=1){
      1
    }else{
      n*factorial(n-1)
    }
  }

  //默认参数值
  def addInt(a:Int=5,b:Int=7): Int ={
    println("默认参数值")
    a+b
  }


  //高级函数  高阶函数可以使用其它函数作为参数,可以使用函数作为输出结果
  //以下实例中,apply() 函数使用了另外一个函数f和值v作为参数,而函数f又调用了参数v
//  def apply(f:Int => String,v:Int) = f(v)
//  def layout[A](x:A) = "["+x.toString+"]"


  def apply(f:(Int,Int) => String,v:Int,n:Int) = f(v,n)

  def layout[A,B](x:A,y:B) = "{"+x.toString+","+y.toString+"]"



  //函数嵌套 并且累加因子 accumulator 只能累加
  def fractional(i:Int):Int={
    def fact(i:Int,accumulator: Int):Int = {
      if(i<=1){
        accumulator
      }else{
        fact(i-1,i*accumulator)
      }
    }
    fact(i,1)
  }
}

/****
 *1. Scala 有方法与函数  二者语义上的区别很小,Scala 方法是类的一部分,而函数是一个对象可以赋值给一个变量
 * 换句话说在类中定义的函数即是方法
 *2. Scala中的函数则是一个完整的对象,Scala中的函数起始就是继承了Trait的类的对象
 *3. Scala中使用val语句可以定义函数,def语句可以定义方法
 *
 *
 *
 *
 *
 */
