import scala.annotation.tailrec


object sumTailRec {
  @tailrec
  def doFromTo(from: Int, to: Int, oper: (Int, Int) => Int, acc: Int): Int = {
    if (from < to) {
      //println(acc + " / " + from)
      doFromTo(from + 1, to, oper, oper(acc, from))
    } else
      acc + from
  }

  def sum(a: Int, b: Int): Int = {
    doFromTo(a, b, operSum, 0);
  }

  def count(a: Int, b: Int): Int = {
    doFromTo(a, b, (a: Int, b: Int) => 1, 0);
  }

  def factorial(a: Int, b: Int): Int = {
    doFromTo(a, b, operMul, 0);
  }

  def operSum(a: Int, b: Int): Int = {
    a + b
  }

  def operMul(a: Int, b: Int): Int = {
    a * b
  }
}

val xxx = new java.util.Date().getTime
sumTailRec.sum(1, 511111)
val xxxx = new java.util.Date().getTime
xxxx - xxx
