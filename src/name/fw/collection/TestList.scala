package name.fw.collection

object TestList {
}

/** 定义列表 */
object DefineList{
  def main(args: Array[String]): Unit = {
    // 字符串列表
    val site:List[String] = List("Runoob", "Google", "Baidu")
    // 整形列表
    val nums:List[Int] = List(1, 2, 3, 4)
    // 空列表
    val emptyList:List[Nothing] = List()
    // 二维列表
    val dim:List[List[Int]] = List(List(1,2),List(3,4,5))

    site.foreach(println _)

    /** 构造列表的两个基本单位是 Nil 和 ::  */
    /** Nil 可表示为一个空列表 */
    /** 以上实例可写成如下所示 */

    val site1 = "Runoob" :: "Google" :: "Baidu" :: Nil
    val nums1 = 1 :: 2 :: 3 :: 4 :: Nil
    val emptyList1 = Nil
    val dim1 = (1 :: 2 :: Nil) :: (3 :: 4 :: 5 :: Nil)

    site1.foreach(println _)
  }
}
/** list中各种符号操作 */
object SymbolOpration{
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    // :: 用于的是向队列的头部追加数据,产生新的列表, x::list,x就会添加到list的头部
    println(4 :: list)  //输出: List(4, 1, 2, 3)
    // .:: 这个是list的一个方法;作用和上面的一样,把元素添加到头部位置; list.::(x);
    println( list.:: (5)) //输出: List(5, 1, 2, 3)
    // :+ 用于在list尾部追加元素; list :+ x;
    println(list :+ 6)  //输出: List(1, 2, 3, 6)
    // +: 用于在list的头部添加元素;
    val list2 = "A"+:"B"+:Nil //Nil Nil是一个空的List,定义为List[Nothing]
    println(list2)  //输出: List(A, B)
    println("A"::"B"::Nil) //输出: List(A, B)
    // ::: 用于连接两个List类型的集合 list ::: list2
    println(list ::: list2) //输出: List(1, 2, 3, A, B)
    // ++ 用于连接两个集合，list ++ list2
    println(list ++ list2) //输出: List(1, 2, 3, A, B)
  }
}

/** 通过给定函数创建列表 */
object Tabulate{
  def main(args: Array[String]): Unit = {
    val functionToList = List.tabulate(6)(_+0)
      println(s"一维 = ${functionToList}")

    val list = List.tabulate(4, 5)(_ * _)
    println(s"二维 = ${list}")
  }
}