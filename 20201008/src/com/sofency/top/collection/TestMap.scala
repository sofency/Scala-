package com.sofency.top.collection

import scala.collection.MapView

/**
 * @author sofency
 * @date 2020/10/8 16:53
 * @package IntelliJ IDEA
 * @description
 *   默认情况下 Scala 使用不可变 Map。如果你需要使用可变集合，
 *   你需要显式的引入 import scala.collection.mutable.Map 类
 */
object TestMap {
  def main(args: Array[String]): Unit = {
    //定义map类型参数
    var temp:Map[Char,Int] = Map()
    temp+=('I'->1)
    temp+=('J'->2)
    temp+=('K'->3)
    for(a <-temp.keys){
      printf(temp(a)+" ")
    }
    println()
    val colors = Map("red"->"#FF0000","azure"->"#F0FFFF")
    println(colors.keys,colors.values)
    println(colors.isEmpty)
    val colors1 = Map("blue"->"#000fef","green"->"7798fe")
    val color2 = colors1.++(colors)//两个集合相加
    println("两个集合相加之后的集合是"+color2)
    println("遍历map")
    color2.keys.foreach { i =>
      print("key = " + i)
      println("  value = "+color2(i))
    }

    //查看是否存在指定的key
    println("查看是否存在指定的key "+color2.contains("blue"))

    println("移除key " + color2.-("blue"))
    println("获取值 "+ color2.get("blue").get)
    println("返回指定键的值"+color2.apply("blue"))
    println("清空"+color2)
    println("删除元素"+color2.drop(1))
//    println("返回满足条件的元素"+color2.iterator.foreach((key:String,value:String) => (
//      key.indexOf("re"))))
    println("最后的元素"+color2.last)
    println("转化为set "+color2.toSet)
  }

}
