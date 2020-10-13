package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/13 10:43
 * @package IntelliJ IDEA
 * @description
 *  提取器的介绍
 *  是从传递给它的对象中提取处构造该对象的参数
 *  Scala提取器是一个带有unapply方法的对象 unapply方法是apply方法的反向操作
 *  unapply接受一个对象,然后从对象中提取值,提取的值通常是用来构造该对象的值
 */
object TestExtractor {
  def main(args: Array[String]): Unit = {
    println("Apply 方法: "+apply("sofency","qq.com"))
    println("unApply 方法: "+unapply("sofency@qq.com").get)
    println("unApply 方法: "+unapply("sofencqq.com"))
  }

  //注入方法
  def apply(user:String,domain:String)={
    user+"@"+domain
  }

  //提取方法 提取出对象的参数
  def unapply(arg: String): Option[(String,String)] = {
    val parts = arg.split("@")
    if(parts.length == 2){
      Some(parts(0),parts(1))
    }else{
      None
    }
  }
}
