import scala.annotation.tailrec

object pascal2 {

  def pascal(col: Int, row: Int): Int = {
    val initList: List[Int] = List(1)
    val lastRow: List[Int] = getPascalRow(initList, row)
    lastRow(col.toInt)
  }

  @tailrec
  def getPascalRow(l: List[Int], depth: Int): List[Int] = {
    val zipped = l.zip(l.tail)
    val ret: List[Int] = List(1) ::: zipped.map(x => x._1 + x._2) ::: List(1)
    //  tmp.map{case (x, y) => x + y}
    if (depth > 1) getPascalRow(ret, depth - 1)
    else ret
  }
}

val xxx = new java.util.Date().getTime
pascal2.pascal(6, 155)
val xxxx = new java.util.Date().getTime
xxxx - xxx
