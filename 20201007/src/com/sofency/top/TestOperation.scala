package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/8 10:32
 * @package IntelliJ IDEA
 * @description  测试运算符
 */
object TestOperation {

  def main(args: Array[String]): Unit = {
     //和java一摸一样
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;
    println("a + b = "+(a + b))
    println(s"a + c = ${a + b}")
    println("a * b = "+(a * b))
    println("a % b = "+(a % b))

    //位运算符
    var temp = 60;
    var count = 13;
    var so = 0;
    println(temp & count)

    println(temp | count)

    println(temp ^ count)

    println(~temp);

  }
}
