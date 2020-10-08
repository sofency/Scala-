package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/7 11:43
 * @package IntelliJ IDEA
 * @description
 */
object TestScala {
  def main(args: Array[String]): Unit = {
    println("hello scala");
    print("hello world":String,12:Int)//输出的是集合
    println()
    //保留有原来java的格式化输出
    printf("name=%s","sofency")
    println()
    //定义变量
    var temp: Int = 12;
    var num:Long =12L;  //定义long类型
    temp=13;
    //定义常量
    val alice:String = "sofency"
    print(temp,alice)
    println()
    //解析上述出现的变量
    println(s"上述出现的变量$temp")
    println(s"进行加减操作${temp*10}")
    println(scala.Symbol("private").toString())

    //多变量声明
    val many,much = (21,"sofency");
    print(many)
  }
}
/**
 * 1.行尾可以不加;
 * 2.定义函数def
 * 3.Scala的数据类型
 *     Byte 8位有符号补码整数  数值区间-128-127
 *     Short 16位有符号补码整数,数值区间-32768-32767
 *     Int 32位有符号补码整数 ,数值区间-2147483648-2147483647
 *     Long 64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
 *     Float 32位
 *     Double 64位
 *     Char 16位无符号字符
 *     String
 *     Boolean true  false
 *     Unit  表示无值 和其它语言的void等同,用作不用返回任何结果的方法的结果类型
 *     Null null 或者空引用
 *     Nothing Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。
 *     Any 	Any是所有其他类的超类
 *     AnyRef AnyRef类是Scala里所有引用类(reference class)的基类
 * 4. 定义变量 var 用来修饰变量的  val是用来修饰定值的 无法进行修改
 * 5. $符号进行引用上述出现的变量,并且可以使用${表达式}进行计算输出
 *
 *
 *
 *
 * */