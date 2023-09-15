object Companion extends App {
  class ExampleofCompanion {

    // Variables of Companion class
    var str1 = "TechCompanion"
    var str2 = "Tutorial of Companion object"

    // Method of Companion class
    def show() = {
      println(str1)
      println(str2)
    }
  }

  // Companion object
  object ExampleofCompanion {
      var obj = new ExampleofCompanion()
      obj.show()



  }
}