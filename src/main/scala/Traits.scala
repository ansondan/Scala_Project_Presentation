object Traits extends App{

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "alligator"
    def eat: Unit = println("zebra")
    def eat(animal: Animal): Unit = println(s"I'm an alligator eating ${animal.creatureType}")

  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
}

