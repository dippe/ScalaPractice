object pascal2 {

  def pascal(col: Long, row: Long): Long = {
    val initList: List[Long] = List(1L)
    val lastRow: List[Long] = getPascalRow(initList, row)
    lastRow(col.toInt)
  }


  def getPascalRow(l: List[Long], depth: Long): List[Long] = {
    val zipped = l.zip(l.tail)
    val ret: List[Long] = List(1L) ::: zipped.map(x => x._1 + x._2) ::: List(1L)
    //  tmp.map{case (x, y) => x + y}
    if (depth > 1) getPascalRow(ret, depth - 1)
    else ret
  }
}

val xxx = new java.util.Date().getTime
pascal2.pascal(6, 155)
val xxxx = new java.util.Date().getTime
xxxx - xxx
