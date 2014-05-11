import scala.annotation.tailrec

object sumTailRec {
  def sum(from: Int, to: Int): Int = {
    loop(to - from, to)
  }

  @tailrec
  def loop(i: Int, acc: Int): Int = {
    if (i == 0) acc
    else loop(i - 1, acc + i)
  }

}

val xxx = new java.util.Date().getTime
sumTailRec.sum(1, 511111)
val xxxx = new java.util.Date().getTime
xxxx - xxx
