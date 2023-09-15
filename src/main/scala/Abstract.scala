object Abstract extends App {
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  //val animal = new Animal

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("crunch crunch")
  }
    val dog = new Dog
    dog.eat
}

