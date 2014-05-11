object pascal2 {

  def pascal(col: BigInt, row: BigInt): BigInt = {
    val initList: List[BigInt] = List(BigInt.int2bigInt(1))
    val lastRow: List[BigInt] = getPascalRow(initList, row)
    lastRow(col.toInt)
  }


  def getPascalRow(l: List[BigInt], depth: BigInt): List[BigInt] = {
    val zipped = l.zip(l.tail)
    val ret: List[BigInt] = List(BigInt.int2bigInt(1)) ::: zipped.map(x => x._1 + x._2) ::: List(BigInt.int2bigInt(1))
    //  tmp.map{case (x, y) => x + y}
    if (depth > 1) getPascalRow(ret, depth - 1)
    else ret
  }
}

val xxx = new java.util.Date().getTime
pascal2.pascal(6, 155)
val xxxx = new java.util.Date().getTime
xxxx - xxx
