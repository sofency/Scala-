package com.sofency.top
import Array._
/**
 * @author sofency
 * @date 2020/10/8 15:37
 * @package IntelliJ IDEA
 * @description
 */
object TestArray {

  //入口函数
  def main(args: Array[String]): Unit = {
    //定义一维数组
    var temp:Array[String] = new Array[String](4);
    temp(0)="alice";
    temp(1)="hello"

    var total = 0;
    //不指定元素的类型
    var m = Array(1,2,3,4)

    for ( i <- 0 to (m.length - 1)) {
      total += m(i);
    }
    println("数组的结果是"+total)

    //找出元素中的最大数
    var max = m(0)
    for(a <- m){
      if(a>max) max = a
    }
    println("最大的值是"+max)

    //多维数组
    val myMatrix = Array.ofDim[Int](3,4)
    for(a <- 0 to 2;b<-0 to 3){
      myMatrix(a)(b)= a*10+b
    }
    var count = 0
    for(a <-0 to 2;b <- 0 to 3){
      count+=1
      print(myMatrix(a)(b)+" ")
      if(count%4==0){
        println()
      }
    }
    println("数组的合并")
    var list1 = Array(1,32,3,32)
    var list2 = Array(2,332,44,5)
    var list3 = Array.concat(list1,list2)
    //要省略掉Array即导入Array._
    var list4 = concat(list1,list2)

    //使用range()区间生成范围数组
    printf("使用range()函数 生成数组")
    var range1 = range(10,20,3)
    for(a <- range1){
      printf(a+" ")
    }
    println()

    //创建指定对象 T 的数组
    var t = apply(1,2,3);//转化为数组
    for(a <- t){
      printf(a+" ")
    }
    println("拷贝数组到新数组上")
    val newArray:Array[Int] = new Array[Int](4);
    copy(t,0,newArray,0,2)//将数组t上面的数值拷贝到newArray上
    for(a <- newArray){
      printf(a+ " ")
    }
    println("创建一个长度为零的整形数组")
    var intNull = empty[Int]
    println(intNull.length)

    val fact = 2
    //创建匿名的数组
    val func = (i:Int) => i*fact+2
    println("iterate")  //按照上一步计算的结果带入下一步的参数进行计算
    var demo = iterate(1,5)(func) //1 4 10 22 46 填充数组

    for(a <- demo){
      printf(a+" ")
    }

    println("填充数组")
    var fillArray = fill(4)(4)//用4填满长度为四的数组
    for(a <- fillArray){printf(a+"  ")}
    println()

    println("计算指定函数  传入下表进行计算")

    var tabArray = tabulate(3)(func)
    for(a <- tabArray){
      printf(a+" ")
    }
    println()

  }

}
