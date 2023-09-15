object Demetri_Scala {


    def main(args: Array[String]): Unit = {

    }

    def sayHello(f: () => Unit): Unit = f()

    def helloJoe(): Unit = println("Hello, Joe")

    sayHello(helloJoe)




}



