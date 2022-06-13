package functionalprogramming

object HOFandCurries extends App{
  
  val superFunction: (Int,(String, (Int=>Boolean)) => Int) => (Int, Int) = null
  
  //function which takes a function as input or give a function as output are called higher order
  //function or HOF
  //example map, flatMap, filter 
  
  //function that applies a function n times over a value of x 
  //nTimes(f, n, x)
  //nTimes(f, 3, x) = f(f(f(x)))
  //nTimes(f, 3, x) = nTimes(f, 2, f(x)) = f(f(f(x)))
  //nTimes(f, n, x) = nTimes(f, n-1, f(z) = f(f(f(f(.......f(x)))))
  
  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) x
    else nTimes(f, n-1, f(x))
  }
  
  val  plustwo = (x:Int) => x + 2
  
  println(nTimes(plustwo, 10, 1))
  
  //ntb(f,n) = x => f(f(f(f.....(x))))
  //increment10 = ntb(plustwo, 10) = x => plustwo(plustwo(.....(x)))
  //val y = increament10(2)
  
  def nTimesBetter(f:Int => Int, n: Int): (Int => Int) = 
    if (n<= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1)(f(x))
    
  val plus20 = nTimesBetter(plustwo, 10)
  println(plus20(1))
  
  //curried functions
  val superAdder: Int => (Int => Int) = (x:Int) => (y:Int) => x + y
  val add3 = superAdder(3) // y => 3 + y
  println(add3(10))
  println(superAdder(3)(10))
  
  
  //functions with multiple parameter lists
  
  def curriedFormatter(c: String)(x: Double): String = c.format(x)
  
  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")
  
  println(standardFormat(math.Pi))
  println(preciseFormat(math.Pi))
  
}