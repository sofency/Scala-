package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/12 17:31
 * @package IntelliJ IDEA
 * @description Iterator 不是一个集合 它是一种访问集合的方法
 *             iterator 只能迭代一次  如果调用max或者min的化 建议转化为list
 */
object TestIterator {
  def main(args: Array[String]): Unit = {
    //遍历
    val it = Iterator(1,2,3,4,5,6)
    val it1 = Iterator(1,2,3,4,5,6)
//    //最大元素
//    println("最大的元素"+it.max)
//    println(it.length)
//    //最小元素
//    println("最大的元素"+it.max)
//    println("长度"+it.length)
//    println("大小"+it.size)
//    while(it.hasNext){
//      printf(it.next()+" ")
//    }
//    println()

    //合并两个迭代器
    it.++(it1);
    println(it.contains(1))
    println(it.mkString("."))
    println(it.contains(1))
  }
}
