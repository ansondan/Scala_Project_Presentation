object Singleton extends App {
  object Person {
    val n_eyes = 2
    def canFly: Boolean = false
  }
  println(Person.n_eyes)
  println(Person.canFly)

  val mary = Person
  val john = Person
  println(mary == john)

}
