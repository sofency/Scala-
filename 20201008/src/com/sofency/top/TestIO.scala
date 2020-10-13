package com.sofency.top

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

/**
 * @author sofency
 * @date 2020/10/13 11:30
 * @package IntelliJ IDEA
 * @description Scala进行文件操作 直接使用的就是java的io类
 */
object TestIO {
  def main(args: Array[String]): Unit = {
//    val write = new PrintWriter(new File("text.txt"))
//    write.write("菜鸟教程")
//    write.close()

    //从屏幕上读取用户输入
//    print("请输入菜鸟教程的官网")
//    val line = StdIn.readLine()
//    println("你输入的是 "+line)

    //从文件中读取内容
    Source.fromFile("text.txt").foreach{
      print
    }
  }

}
