package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/8 10:40
 * @package IntelliJ IDEA
 * @description
 */
object TestIf {
  def main(args: Array[String]): Unit = {
    //Console从控制台输入
    var temp:Int = Console.in.read();
    if(temp>18){
      println("已经成年")
    }else if(temp<35){
      println("而立之年")
    }else{
      println("老了")
    }
  }

}
