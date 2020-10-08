package com.sofency.top.collection

/**
 * @author sofency
 * @date 2020/10/8 16:53
 * @package IntelliJ IDEA
 * @description Scala Option是用来表示一个值是可选的
 *             Option[T]是一个类型为T的可选值容器,如果值存在,Option[T]就是一个Some[T]
 *             如果不存在就是一个对象None
 */
object TestOption {
  def main(args: Array[String]): Unit = {
    val map:Map[String,String] = Map("key1"->"values")
    println(map("key1"))
    //使用.get防止出现空指针异常
    println(map.get("key2"))
    val option =Some(21,2,2)
    println(option.get)
    println("元素的个数"+option.productArity)//就是一个选项
    println("获取元素的选项"+option.productElement(0))
    println(map.getOrElse("key12","sophia"))
    val option1 = None
    println(option.isDefined,option1.isDefined)
  }
}
