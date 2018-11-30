package name.fw.collection

object TestList {

  object DefineList{
    def main(args: Array[String]): Unit = {
      // 字符串列表
      val site:List[String] = List("Runoob", "Google", "Baidu")
      // 整形列表
      val nums:List[Int] = List(1,3,3)
      // 空列表
      val emptyList:List[Nothing] = List()
      // 二维列表
      val dim:List[List[Int]] = List(List(1,2),List(3,4,5))
    }
  }

}
