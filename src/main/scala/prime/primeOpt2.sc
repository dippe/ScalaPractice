import scala.collection.mutable.ListBuffer

def isPrime(num: Int): Boolean = {
  def div(num: Int, divAcc: Int): Boolean = {
    //print(divAcc + " ")

    // This is lower than prev example!!!! what the f...
    if (num % divAcc == 0) {
      if (divAcc >= num)
        true
      else
        false
    }
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
val primeList = ListBuffer[Int]()
val xxx = new java.util.Date().getTime
for (i: Int <- 1 to 111111)
  if (isPrime(i))
    print(i + " ")
//    primeList += (i)
val xxxx = new java.util.Date().getTime
xxxx - xxx
print(primeList)

