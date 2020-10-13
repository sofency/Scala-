package com.sofency.top

import java.io.{FileNotFoundException, FileReader,IOException}

/**
 * @author sofency
 * @date 2020/10/13 10:38
 * @package IntelliJ IDEA
 * @description
 */
object TestException {
  def main(args: Array[String]): Unit = {
    try {
        val file = new FileReader("input.ttx")
    }catch {
      case ex:FileNotFoundException =>println("file not found")
      case ex:IOException => println("io exception")
    }finally {
      println("last output")
    }
  }
}
