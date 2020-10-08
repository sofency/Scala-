package com.sofency.top.collection

/**
 * @author sofency
 * @date 2020/10/8 16:52
 * @package IntelliJ IDEA
 * @description  列表是不可变的 如果要可变的列表 需要引入可变的包
 */
object TestList {
  def main(args: Array[String]): Unit = {
    //定义列表
    val site:List[String] = List("sofnecy","alice","baidu");
    //等同于
    val site1 = "sofnecy"::("alice"::("baidu"::Nil))

    println("site head "+site.head)
    println("site tail "+site.tail)
    println("site isEmpty "+site.isEmpty)

    val nums: List[Int] = List(1,2,3,4)
    //等同于
    val nums2 = 1::(2::(3::Nil))

    //空列表
    val empty:List[Nothing] = List()
    val emptyNil = Nil

    //二微数组
    val dim:List[List[Int]] = List(
      List(1,2,3),
      List(4,5,6),
      List(7,8,9)
    )
    //等同于
    val dimTest=(1::(2::(3::Nil)))::
      (0::(1::(2::Nil)))::
      (1::(2::3::Nil))::Nil


    //连接列表
    val site3 = site:::site1
    val site4 = site.concat(site1)
    println(site3,site4)

    //fill方法Array的用法一致
    val list = List.fill(4)(6)
    println(list)

    val tab = List.tabulate(4)(a => a*2)
    println(tab)
    val func = (a:Int,b:Int) => {
      a*3+b*4
    }
    val tab1 = List.tabulate(3,4)(func)
    println(tab1)

    //反转
    println(site.reverse)

    //添加元素
    val temp = "taobao"+:site
    println(temp)

    println("连接的字符串是"+(temp:::site))

    //获取字符串
    println(site.apply(2))

    println("去重"+temp.distinct)
    println(temp)
    println("删除掉元素"+temp.drop(1))
    println("存在元素"+temp.exists(s=> s.equals("taobao")))
    println("过滤掉元素长度小于5的元素"+temp.filter(s=>s.length>5))
    println("通过给定的方法将元素加上1"+temp.map(s=>s.concat("2")))
    println("最大的元素"+nums2.max)
    println("求和"+nums2.sum)
    println("字符串输出"+site.mkString(","))
    val sort = List(3,32,12,3,4,6,1)
    println("列表排序"+sort.sorted)
    println("最后一个元素"+sort.last)
  }
}

/****
 * set 和list 的api   set两个集合合并有++和.++()方法
 * 基本一致唯一的区别就是不存在重复的元素
 */
