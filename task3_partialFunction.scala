package task4_acadgild

  object mainObject9{
  
      def main(args:Array[String])
    {
       def squareInt ( x : Int , y : Int, z : Int, f: (Int,Int,Int) => Int  ): Unit=
      {
   println("square : " +(f(x,y,z) * f (x,y,z)))
    
      }
      
       def addPartial(a : Int , b :Int, c:Int) : Int =
        (    
            a + b + c   
          )
		   val a = addPartial(1, 2, 3)
		   println("Sum: " +a)
		
       val b = addPartial(_: Int, _: Int, 3)  //PartialFunction
       val sum = b(6,5)
       println("Sum_Partial: " +sum)
    
       val c = addPartial _                   //PartialFunction
       val sum2 = c(10,23,14)
       println("Sum_Partial: " + sum2)
       
       squareInt (5,5,10,addPartial) 
      
    }  
}