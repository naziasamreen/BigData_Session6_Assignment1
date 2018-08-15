package task4_acadgild

abstract class IceCream(name : String) {
   def printName : Unit = println(name)
   println("Strawberry")
}

class VanillaIceCream(name: String) extends IceCream (name : String) {
   override def printName: Unit = println(name)
}

class MangoIceCream(name: String) extends VanillaIceCream(name:String) {
   override def printName: Unit = println(name)
   
}

object MainObject1{  
    def main(args:Array[String]){  
   
val iceCream = new VanillaIceCream("Vanilla IceCream")
iceCream.printName
val MangoIceCream = new MangoIceCream("Mango")
MangoIceCream.printName
}
}