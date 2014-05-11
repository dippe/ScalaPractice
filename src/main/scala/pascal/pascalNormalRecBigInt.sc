object pascal1 {
  def pascal(c: BigInt, r: BigInt): BigInt = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}

val xxx = new java.util.Date().getTime
pascal1.pascal(6, 55)
val xxxx = new java.util.Date().getTime
xxxx - xxx
