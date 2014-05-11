import scala.annotation.tailrec

def isPrime(num: Int): Boolean = {

  val maxDiv: Int = Math.round(num / 2)

  @tailrec
  def div(num: Int, divAcc: Int): Boolean = {
    if (divAcc >= maxDiv)
      true
    else if (num % divAcc == 0)
      false
    else
      div(num, divAcc + 2)
  }

  if (num % 2 == 0)
    false
  else if (num < 4)
    true
  else
    div(num, 3)
}
val xxx = new java.util.Date().getTime
for (i <- 1 to 111111)
  if (isPrime(i))
    print(i + " ")
//print(" ")
val xxxx = new java.util.Date().getTime
xxxx - xxx

