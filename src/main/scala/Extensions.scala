
extension (s: String)
  def capitalizeFirstLetter: String = if s.isEmpty then s else s.charAt(0).toUpper + s.substring(1)

@main def extensions(): Unit = {
  val input = "hello, world!"
  val output = input.capitalizeFirstLetter

  println(output) // Output: Hello, world!
}
