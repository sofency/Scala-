package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/8 12:16
 * @package IntelliJ IDEA
 * @description  测试str
 */
object TestStr {
  def main(args: Array[String]): Unit = {
    //定义字符串
    val greeting:String = "hello world";
    //String 是不可改变的字符串  意味着每一次修改字符串就会重新产生把一个新的字符串对象
    //可以修改的字符串定义
    val buf = new StringBuilder
    buf+='a'
    //添加多个字符串的符号是++=
    buf++="sasas"
    println(buf.toString())
    //查看字符串的长度
    println("查看字符串的长度"+buf.length())
    //字符串的连接
    var temp:String = "hello world"
    println("连接两个字符串"+buf.toString().concat(temp))
    //格式化字符串
    var floatVar = 23.4f
    var intVar = 12
    var strVar = "sofnecy"
    printf("格式话的字符串是  浮点数 %f,整数变量%d,字符串变量 %s",floatVar,intVar,strVar)

    temp = "how old are you"
    var temp1 = "how old are YOU"
    println("第一个字符是"+temp.charAt(1));
    println("内容比较的结果"+temp.contentEquals(buf))
    println("忽略大小进行比较"+temp.equalsIgnoreCase(temp1))
    println("不忽略大小写进行比较"+temp.equals(temp1))
    //temp比temp1大返回1 小返回-1 相等返回0
    println("忽略大小写进行比较"+temp.compareToIgnoreCase(temp1))
    println("转换位小写"+temp1.toLowerCase)
    println("转换为大写"+temp1.toUpperCase)
    //转换为字符数组
    var temp2:Array[Char] = temp.toCharArray;
    //变量可以不进行定义数据类型
//    for( a <- temp2){
//      println(a)
//    }
  }
}
