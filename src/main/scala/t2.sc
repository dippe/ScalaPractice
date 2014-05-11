import scala.annotation.tailrec

def doFromTo(from: BigInt, to: BigInt, oper: (BigInt, BigInt) => BigInt): BigInt = {
  if (from < to) {
    oper(doFromTo(from + 1, to, oper), from)
  } else
    from
}
def operSum(a: BigInt, b: BigInt): BigInt = {
  a + b
}

def operMul(a: BigInt, b: BigInt): BigInt = {
  a * b
}

def pascal(c: BigInt, r: BigInt): BigInt = {
  if (c == 0 || c == r) 1
  else pascal(c - 1, r - 1) + pascal(c, r - 1)
}

def sum(a: BigInt, b: BigInt): BigInt = {
  doFromTo(a, b, operSum);
}

def factorial(a: BigInt, b: BigInt): BigInt = {
  doFromTo(a, b, operMul);
}
sum(2, 4) == 9
sum(4, 4) == 4
sum(1, 1)
factorial(1, 5)

object valami {
  @tailrec
  def doFromTo2(from: BigInt, to: BigInt, oper: (BigInt, BigInt) => BigInt, acc: BigInt): BigInt = {
    if (from < to) {
      //println(acc + " / " + from)
      doFromTo2(from + 1, to, oper, oper(acc, from))
    } else
      acc + from
  }

  def sum2(a: BigInt, b: BigInt): BigInt = {
    doFromTo2(a, b, operSum, 0);
  }

  def count2(a: BigInt, b: BigInt): BigInt = {
    doFromTo2(a, b, (a: BigInt, b: BigInt) => 1, 0);
  }

  def factorial2(a: BigInt, b: BigInt): BigInt = {
    doFromTo2(a, b, operMul, 0);
  }

  sum2(2, 4)
  sum2(4, 4)
  sum2(1, 1)
}

val xxx = new java.util.Date().getTime
pascal(6, 2222)
val xxxx = new java.util.Date().getTime
xxxx - xxx
