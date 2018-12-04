package name.fw.collection

object TestTuple {
}

object DefineTuple{
  def main(args: Array[String]): Unit = {

    // 元组的实际类型取决于它的元素的类型，比如 (99, "runoob") 是 Tuple2[Int, String]
    val t = (1, 3.14, "Fred")
    val t1 = new Tuple3(1, 3.14, "Fred")

  }
}

/** 访问元素 */
object TupleBasicOperation{
  def main(args: Array[String]): Unit = {
    // 用 t._1 访问第一个元素， t._2 访问第二个元素
    val t = (4,3,2,1)
    val sum = t._1 + t._2 + t._3 + t._4
    println( "元素之和为: "  + sum )
  }
}
/** 迭代 */
object Iterator{
  def main(args: Array[String]): Unit = {
    val t = (4,3,2,1)
    t.productIterator.foreach{ i =>println("Value = " + i )}
  }
}