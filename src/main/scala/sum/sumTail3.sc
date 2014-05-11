import scala.annotation.tailrec


object sumTailRec {
  @tailrec
  def sum(from: Int, to: Int, acc: Int): Int = {
    if (from < to) {
      //println(acc + " / " + from)
      sum(from + 1, to, acc + from)
    } else
      acc + from
  }

}

val xxx = new java.util.Date().getTime
sumTailRec.sum(1, 511111, 0)
val xxxx = new java.util.Date().getTime
xxxx - xxx
