package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/13 10:25
 * @package IntelliJ IDEA
 * @description
 *             模式匹配 一个模式匹配包含了一系列的备选项 每个都
 *             开始于关键字case 每个备选项都包含了一个模式及一到多个表达式
 *             箭头符号隔开了模式和表达式
 */
object TestCase {
  //样例类
  case class Person(name:String,age:Int)


  def main(args: Array[String]): Unit = {
    println(matchObject(5))
    println(matchAny(5))
    println("-------------------------")
    val alice = new Person("alice",12)
    val sofency = new Person("sofency",22)
    val marry = new Person("marry",19)

    for(person <- List(alice,sofency,marry)){
      person match {
        case Person("alice",12)=>println("alice")
        case Person("sofency",22)=>println("sofency")
        case Person(name,age)=>
          println("name "+name+" age: "+age)
      }
    }
  }

  //模式匹配 对应java的switch
  def matchObject(x:Int) : String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case _ => "other"
  }
  //比switch强大 可以匹配任何数据类型
  def matchAny(x:Any):Any = x match {
    case 1 => "one"
    case "two" => 2
    case y:Int => "Scala.Int"  //判断输入的数据类型
    case _ =>"many"
  }
}

