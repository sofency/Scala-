package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/13 11:25
 * @package IntelliJ IDEA
 * @description
 */
object TestApply {
  def main(args: Array[String]): Unit = {
    val x = TestApply(5)
    println(x)
    x match {
      case TestApply(num)=>println(x+" 是 "+num+" 的两倍")
      case _ => println("无法计算")
    }
  }

  //apply类似于java的构造函数
  def apply(x:Int): Int = x*2

  //求出参数
  def unapply(arg :Int):Option[Int] = {
    if (arg%2==0) Some(arg/2) else None
  }
}
