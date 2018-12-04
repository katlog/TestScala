import scala.collection.mutable

object Main {

  def main(args: Array[String]): Unit = {
    printf("first scala")
    val map = Map("a" -> 1, "b" -> 2)
    val mm = ("11" -> 3, "123", 4)

    val t = (1, 2, "33")

    for (m <- map ) {

    }

    var capital = Map()
  }

  class ChecksumAccumulator1 {
    private var sum = 0
    def add(b:Byte):Unit=sum+=b
    def checksum():Int= ~(sum&0xFF)+1
  }

  class ChecksumAccumulator{
    private var sum=0
    def add(b:Byte) :Unit = sum +=b
    def checksum() : Int = ~ (sum & 0xFF) +1
  }

}
