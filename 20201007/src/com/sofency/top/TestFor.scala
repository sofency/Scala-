package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/8 10:43
 * @package IntelliJ IDEA
 * @description
 */
object TestFor {
  def main(args: Array[String]): Unit = {
//    //While 循环
//    var count:Int = Console.in.read();
//    var cnt = count - '0';
//    while(cnt > 0){
//      println("hello world"+cnt)
//      cnt-=1
//    }
//    println("-------------------")
//    var t = 10;
//    do{
//      println("hel"+t)
//      t-=1
//    }while(t>0)


    //创建数组
    var temp = new Array[Int](10);
    println("第一种for循环")
    for(item <- temp){
      print(item+" ")
    }

    println("第二种for循环 to和until")
    var a = 0;
    for(a <- 1 to 10){
      print("value = "+a+" ")
    }
    println()
    for(a<-3 until 10){
      println("until"+a)
    }

    println("第三种for循环 双重循环")
    var b,c = 0
    for(b<-1 to 4;c<-2 to 4){
      println(b,c)
    }

    //创建list集合
    println("第四种for循环 遍历集合")
    val numList = List(1,2,3,4,58)
    a = 0;//开始的下标
    for(a <- numList){
      println("value="+a)
    }

    //循环过滤
    println("for循环过滤")
    a = 0
    for(a<-numList; if a %2==0;if a>10){
      println("过滤后的数字"+a)
    }


    //新姿势  将for循环过滤的结果存储到新的集合中借助yield
    a = 0
    val tempList = List(1,2,3,4,5,6,7,8,9)
    val retVal = for{
      a <- tempList if a%2==0;if a>5
    }yield a

    println("此时的a"+a)
    for(a <- retVal){
      println("此时的a是"+a)
    }



  }

  //在object 外先运行  之后再运行main方法

}
