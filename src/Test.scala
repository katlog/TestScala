object Test {

  def main(args: Array[String]): Unit = {
     var  capital = Map("US"->"washington","France"->"paris")
    capital +=("Japan"->"bbb")
    println(capital.toString())

    println(capital("Japan"))

    println(factorial(30))
  }

  def factorial(x:BigInt):BigInt=
    if(x==0) 1 else factorial(x-1)*x


  def receive = {
  }
}

