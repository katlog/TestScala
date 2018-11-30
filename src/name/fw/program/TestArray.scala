package name.fw.program

object TestArray {
  /** 定义数组 */
  object DefineArray{
    def main(args: Array[String]): Unit = {
      var list1:Array[Int] = new Array[Int](3)
      var list2 = new Array[String](4)
      var list = Array(1,3,4,5)
    }
  }
  /** 循环数组 */
  object CircleArray{
    def main(args: Array[String]): Unit = {
      var list = Array(1,3,4,5)
      for (li<-list)
        println(li)
      for(i<-0 to (list.length-1))
        println(list(i)+"------")
    }
  }

  /** 多维数组*/
  object MultiDimensionalArray  {
    def main(args: Array[String]) {
      var myMatrix = Array.ofDim[Int](3,3) //二维数组
      //    var myMatrix = Array.ofDim[Array[Array[Int]]](3,3)
      val myArray = Array.ofDim[Int](3,3,3) //三维数组

      for (i <- 0 to 2) {
        for ( j <- 0 to 2) {
          myMatrix(i)(j) = j
        }
      }
      for (i <- 0 to 2) {
        for ( j <- 0 to 2) {
          print(" " + myMatrix(i)(j))
        }
        println()
      }

      val arr2 = Array.ofDim[String](2, 2)
      arr2(0)(0) = "aa"
      arr2(1)(0) = "bb"
      for(i <- 0 until arr2.length; j <- 0 until arr2(0).length){
        println(arr2(i)(j))
      }
    }
  }

  /** 合并 */
  import Array._
  object Contain{

    def main(args: Array[String]): Unit = {
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)
      var myList3 =  concat( myList1, myList2)

      for (li <- myList3) {
        println(s"li = ${li}")
      }
    }
  }

  /** 区间数组 */
  object Range{
    def main(args: Array[String]): Unit = {
      var myList1 = range(10,20,2)
      var myList2 = range(1,10)
      for ( li1 <- myList1 ) {
        println(s"li1 = ${li1}")
      }

      for (li2 <- myList2 ) {
        println(s"li2 = ${li2}")
      }
    }
  }
}




