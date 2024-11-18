
@main def higherOrderFunction(): Unit = {
  val square: Int => Int = x => x * x
  val addOne: Int => Int = x => x + 1

  val squareThenAddOne = square.andThen(addOne)

  val result = squareThenAddOne(4)

  println(result) // Output: 17
}
