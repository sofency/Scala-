package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/13 10:15
 * @package IntelliJ IDEA
 * @description 类似于java的接口
 */
//定义类似的接口 但是其中还可定义变量和实现的函数 更类似于抽象类
trait TestTrait {
  //是否相等
  def isEqual(x:Any):Boolean
  //实现的方法
  def isNotEqual(x:Any) :Boolean = !isEqual(x)
}
class Apple(size:Int) extends TestTrait{
    def isEqual(x: Any): Boolean = {
    if(x==size)
      true
    else
      false
  }
}

object TestDemo{
  def main(args: Array[String]): Unit = {
    val apple = new Apple(10)
    println("result: "+apple.isEqual(10))
    println("result: "+apple.isNotEqual(11))
  }
}