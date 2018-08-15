package task4_acadgild
/*
// reduce the value at construct time....
        int div = numerator == 0 ? 1 : getGCD(numerator, denominator);
        // div is guaranteed to be a divisor, so integer division is safe
        this.numer = numerator/div;
        this.denom = numerator == 0 ? 1 : denominator/div;

class Rational(numerator: Int,denominator: Int) {
  
  def Rational(numerator: Int, denominator: Int) = {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
 */       
 class Rational(n: Int, d: Int) {
  
     require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g

 //   def this(n: Int) = this(n, 1)

  
    def + (that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )
   
     def + (i: Int): Rational = {
    new Rational(numer + i * denom, denom)
    }

      def - (that: Rational): Rational =
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )

    def - (i: Int): Rational =
      new Rational(numer - i * denom, denom)

    def * (that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)

    def * (i: Int): Rational =
      new Rational(numer * i, denom)

    def / (that: Rational): Rational =
      new Rational(numer * that.denom, denom * that.numer)

    def / (i: Int): Rational =
      new Rational(numer, denom * i)

    override def toString = numer +"/"+ denom

     def gcd(a: Int, b: Int): Int = 
      if (b == 0) a else gcd(b, a % b)
  }

object DemoCalculator {
   def main(args: Array[String]) {
     println("Enter four numbers where first two number represent numerator and denominator ot first number and the " +
         "other two number represent numerator and denominator of second number")
       val a= readInt()
       val b= readInt()
       val c= readInt()
       val d=readInt()
       val rat1 = new Rational(a,b) 
       val rat2 = new Rational(c,d)
  
     val add = rat1.+(rat2)
     println("Addition " + add)
     
     val sub = rat1.-(rat2)
     println("Subtraction " +sub)
     
     val mul= rat1.*(rat2)
     println("Multiplication " +mul)
     
     val div= rat1./(rat2)
     println("Division" +mul)
   }
 } 