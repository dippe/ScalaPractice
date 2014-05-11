import scala.annotation.tailrec

def isPrime(num: Int): Boolean = {

  val maxDiv: Int = Math.round(num / 2)

  var divAcc: Int = 3

  if (num % 2 == 0)
    false
  else if (num < 4)
    true
  else {
    while ((divAcc <= maxDiv) || (num % divAcc != 0)) {
      divAcc += 2
    }

    if (divAcc >= maxDiv)
      true
    else
      false

  }
}
val xxx = new java.util.Date().getTime
for (i <- 1 to 111111)
  if (isPrime(i))
    print(i + " ")
//print(" ")
val xxxx = new java.util.Date().getTime
xxxx - xxx

