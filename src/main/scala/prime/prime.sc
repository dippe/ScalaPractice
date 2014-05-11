
def isPrime(num: Int): Boolean = {

  def div(num: Int, divAcc: Int): Boolean = {
    if (num % divAcc == 0)
      false
    else if (divAcc < 4)
      true
    else
      div(num, divAcc - 2)
  }

  if (num % 2 == 0)
    false
  else if (num < 4)
    true
  else
    div(num, num - 2)
}


val xxx = new java.util.Date().getTime
for (i <- 1 to 111111)
  if (isPrime(i))
    print(i + " ")
val xxxx = new java.util.Date().getTime
xxxx - xxx

