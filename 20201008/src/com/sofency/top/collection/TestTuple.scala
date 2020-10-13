package com.sofency.top.collection

/**
 * @author sofency
 * @date 2020/10/12 17:08
 * @package IntelliJ IDEA
 * @description 元组和其它的集合元素不同 主要在于 元组可以存储不同类型的元素
 */
object TestTuple {
  def main(args: Array[String]): Unit = {
    val tuple = new Tuple5(1,2,3,"alice","sofecy")
    //遍历元组
    for(t <- tuple.productIterator){
      print(t+" ")
    }
    //元组转化为字符串
    println()
    println(tuple.toString())
    //元组的元素交换
    val tuple2 = new Tuple2("21","12")
    println(tuple2.swap)
    //元组的访问
    println(tuple._3)
  }

}
