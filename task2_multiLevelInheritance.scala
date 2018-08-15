package task4_acadgild

class Car{
   def Car() : Unit  = println("Class Car");
   def vehicleType() : Unit = println("Vehicle Type: Car");
   }

class Maruti extends Car{
   def Maruti() : Unit = println("Class Maruti");
   def brand() : Unit = println("Brand: Maruti");
   def speed() : Unit = println("Max: 90Kmph");
}

class Maruti800 extends Maruti{
  def Maruti800() : Unit = println("Maruti Model: 800");
  override def  speed() : Unit = println("Max: 80Kmph");
}

  object mainObject2 {
    def main(args:Array[String])
    {
	val obj = new Maruti800();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}