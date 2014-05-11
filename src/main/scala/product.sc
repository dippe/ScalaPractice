
def product(f: Int => Int)(a: Int, b: Int): Int = {

  def loop(i: Int, acc: Int): Int = {
    if (i > 0) {
      loop(i - 1, acc + f(i))
    } else {
      acc
    }
  }

  loop(b - a, a)

}

product(x => x + x)(1, 4)