import scala.jdk.CollectionConverters.ListHasAsScala

@main def interoptability(): Unit = {
  val person = new Person("Donald Trump", 78)

  println(person.age) // Output: 78

//  val list: List[String] = Interoptability.getList.asScala.toList
//
//  println(list.mkString(", ")) // Output: Java, Kotlin, Scala
}
