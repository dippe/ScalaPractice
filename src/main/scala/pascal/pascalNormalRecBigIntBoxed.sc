object pascal1 {
  def pascal(c: BigInt, r: BigInt): BigInt = {
    if (c == BigInt.int2bigInt(0) || c == r) BigInt.int2bigInt(1)
    else pascal(c - BigInt.int2bigInt(1), r - BigInt.int2bigInt(1)) + pascal(c, r - BigInt.int2bigInt(1))
  }
}

val xxx = new java.util.Date().getTime
pascal1.pascal(6, 55)
val xxxx = new java.util.Date().getTime
xxxx - xxx
