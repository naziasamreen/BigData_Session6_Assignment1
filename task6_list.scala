package task4_acadgild

object DemoList {
   def main(args: Array[String]) {

val numberList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)             //> numberList  : List[Int] = List(1, 2, 3, 4, 5)
val sum = numberList.sum                                             
println("Sum Of all the numbers is : " +sum)  
println("Total elements in the list : "+numberList.length)
println("Average of the numbers in the list : " + sum/numberList.length)
val sumeven= numberList.filter( (x: Int) => x % 2 == 0)                // filtering even numbers
println(sumeven)
println("Sum of all the even numbers in the list: " + sumeven.sum )
val divideby = numberList.filter((x: Int) => x % 5 == 0 && x % 3 == 0 ) // number divided by 5 and 3
println(divideby)
println("Total number of elements in the list divisible by both 5 and 3 : " +divideby.length )
}
}