package task4_acadgild

object DemoMatch {
   def main(args: Array[String]) {
     println("Type the course name to get the price details")
       val read= readLine()
       println(matchTest(read))
    
   }
   
   def matchTest(x: String): String = x match {
      case "Android App Development" => "14,999 INR"
      case "Data Science" => "49,999 INR"
      case "Big Data Hadoop & Spark Developer" => "24,999 INR"
      case "Blockchain Certification" => "49,999 INR"
      case _ => "Invalid Input/Course doesnot exists"
   }
}

