package name.fw.collection

object TestMap {
}

object DefineMap{
  def main(args: Array[String]): Unit = {
    // 空哈希表，键为字符串，值为整型
    var A:Map[Char,Int] = Map()
    // Map 键值对演示
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
  }
}

/** 符号操作++、.++ */
object SymbolOperation{
  def main(args: Array[String]): Unit = {
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
    //  ++ 作为运算符
    var colors = colors1 ++ colors2
    println( "colors1 ++ colors2 : " + colors )
    //  ++ 作为方法
    colors = colors1.++(colors2)
    println( "colors1.++(colors2)) : " + colors )

  }
}

/** 基本操作 */
object BasicOperation{
    def main(args: Array[String]) {
      /** 取值 */
      var m=Map("james"->20,"luce"->22)
      //根据Key获取value 如果key不存在的话会抛出异常//根据Key获取value 如果key不存在的话会抛出异常
      m("james")
      //等同于m1("james") 如果key不存在的话会 返回None
      m.get("james")
      //给key 设置一个默认值，如果key 不存在就设置为20 不至于抛出异常
      m.getOrElse("tom", 20)
      //获取所有的key
      m.keys
      //获取所有的value
      m.values

      /** 取值、添加、遍历 */
      var m1=scala.collection.mutable.Map[String,Int](("tom",12),("jim",21))
      var m2=scala.collection.immutable.Map[String,Int](("tom2",22),("jim2",21))
      //取值
      println("m1--->"+m1("tom"))
      println("m2--->"+m2("tom2"))
      //添加元素
      m1+=("jony"->2)
      m2+=("jony2"->62)
      println("m1="+m1)
      println("m2="+m2)
      //遍历元素
      m1.foreach(x=> {println("m1==>"+x._1)})
      m2.foreach(x=> {println("m2==>"+x._2)})
      //根据key得到值得遍历
      m1.keys.foreach { x => {println("m1 的key is  【"+x)} }
      //直接遍历值
      m2.values.foreach { x =>{println("m2 的value is 【"+x)} }


      /** key、values、isEmpty操作 */
      val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
      println( "colors 中的键为 : " + colors.keys )
      println( "colors 中的值为 : " + colors.values )
      println( "检测 colors 是否为空 : " + colors.isEmpty )
      println( "检测 nums 是否为空 : " + Map().isEmpty )


    }
}