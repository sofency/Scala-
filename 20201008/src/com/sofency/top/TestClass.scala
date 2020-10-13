package com.sofency.top

/**
 * @author sofency
 * @date 2020/10/12 17:46
 * @package IntelliJ IDEA
 * @description
 */
class TestClass {

}

class Point(xc:Int,yc:Int){
  var x:Int = xc
  var y:Int = yc
  def current = "x:"+x+" y:"+y
  def move(dx:Int,dy:Int): Unit ={
    x=x+dx
    y=y+dy
    println("x的坐标点: "+x)
    println("y的坐标点: "+y)
  }
}

class Location( val xc:Int, val yc:Int, val zc:Int) extends Point(xc,yc){
  var z:Int = zc

  //重写方法加上override
  override def current: String = super.current+" z:"+z

  def move(dx: Int, dy: Int,dz:Int): Unit ={
    x=x+dx
    y=y+dy
    z=z+dz
    println("x的坐标点: "+x)
    println("y的坐标点: "+y)
    println("z的坐标点: "+z)
  }
}
object Test{
  def main(args: Array[String]): Unit = {
    val pt = new Point(10,20)
    val ps = new Location(1,2,3)
    ps.move(1,2,3)
    println(ps.current)
    //移动到一个新的位置
    pt.move(1,2)
  }
}

/**
 * 继承
 * Scala继承一个基类和Java很相似 但是我们需要注意以下机电
 * 1. 重写非抽象方法必须使用override修饰符
 * 2. 只有主构造函数才可以往基类的构造函数里写参数
 * 3. 在子类中重写超类的抽象方法时,你不需要使用override关键字
 * */
