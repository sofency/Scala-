package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/8 10:18
 * @package IntelliJ IDEA
 * @description
 */
class Outer {

  //入口函数
  //修饰符的学习  private protected public
  //如果没有指定访问修饰符 默认情况 Scala的访问级别都是public
  //Scala中private限定符,比java更严格,在嵌套类的情况下,外层类甚至不能访问被嵌套类的私有成员
  class Inner{
    private def f(): Unit ={
      println("function")
    }
    def fun(): Unit = {
      println("内部类")
    }
    class InnerMost{
      f();
      def hello(name:String) : String = {
        return name
      }
    }
  }

//  object func{
//    def main(args: Array[String]): Unit = {
//      def main(args: Array[String]): Unit = {
//        val in: Inner = new Inner
//        in.fun()
//      }
//    }
//  }
}

