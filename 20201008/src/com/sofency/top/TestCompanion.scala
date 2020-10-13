package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/12 18:19
 * @package IntelliJ IDEA
 * @description  测试伴生类  如果class的名字和object的名字是相同的 那么object就叫做class的伴生对象 类和他的伴生对象可以互相访问齐私有成员
 */
class TestCompanion private(color:String){
  println("测试私有构造")
}

//构建私有方法
class Marker private(val color:String){
  println("创建"+this)

  override def toString: String = "颜色是 "+ color
}

object Marker{
  //私有方法
  private val markers :Map[String,Marker] = Map(
    "red"->new Marker("red"),
    "blue"->new Marker("blue"),
    "green"->new Marker("green")
  )

  def apply(color: String): Marker = {
    if(markers.contains(color)){
      markers(color)
    }else null
  }



  def getMarker(color:String) ={
    if(markers.contains(color)){
      markers(color)
    }else null
  }

  def main(args: Array[String]): Unit = {
//    new TestCompanion("re"); 私有的构造方法无法访问
    println("调用类的私有构造方法"+Marker("red"))
    //单例调用 省略.
    val str1 = "sofency"
    val str2 = "alice"
    println(Marker getMarker "blue")
  }
}