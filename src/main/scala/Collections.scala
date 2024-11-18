@main def collections(): Unit = {
  val list = 1 to 5

  val result = list
    .map { _ + 2 }
    .filter { _ % 2 == 0 }
    .flatMap { n => List(n, n) }
    .reduce { _ * _ } // or `.product`

  println(result) // Output: 576

  val sum = list.sum

  println(sum) // Output: 15
}
