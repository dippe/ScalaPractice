import scala.annotation.tailrec

object sumNormalRec {

  def doFromTo(from: Int, to: Int, oper: (Int, Int) => Int): Int = {
    if (from < to) {
      oper(doFromTo(from + 1, to, oper), from)
    } else
      from
  }

  def operSum(a: Int, b: Int): Int = {
    a + b
  }

  def operMul(a: Int, b: Int): Int = {
    a * b
  }

  def sum(a: Int, b: Int): Int = {
    doFromTo(a, b, operSum);
  }

  def factorial(a: Int, b: Int): Int = {
    doFromTo(a, b, operMul);
  }
}

val xxx = new java.util.Date().getTime
sumNormalRec.sum(1, 7111)
val xxxx = new java.util.Date().getTime
xxxx - xxx
