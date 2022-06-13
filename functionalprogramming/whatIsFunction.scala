package functionalprogramming

object whatIsFunction extends App{
  
  // use funtions as first class elements 
  //problem is object oriented coding, that means everything is object 
  
  val triple = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 3
    
  }
  println(triple(3))
  
  val stringToInteger = new Function[Int, String] {
    override def apply(int: Int): String = int.toString + " Hi "
  }
  
  println(stringToInteger(3))
  
  val adder: ((Int, Int) => Int) =  new Function2[Int, Int, Int]{
    override def apply(a: Int, b: Int): Int = a + b
    
  }
  
  println(adder(5,6))
  
  /*
   * Function types Function2[A, B, R] === (A,B) => R
   * All SCALA functions are object
   * 1. a function which takes 2 strings and concatnates them
   * 2. transform the MyPredicate and MyTransformer into function types
   * 3. define a function which takes an int and return another functions which takes an int and return and int
   *  - what's the type of this function
   *  - how to do it
   */
  
  val concatnator: ((String, String)=> String) = new Function2[String, String, String] {
    override def apply(a:String, b: String) : String = a + b
    
  }
  println(concatnator("Raj ", "Kumar"))


// Higher order function
//Function1[Int, Function1[Int, Int]]
val specialFunction: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
  override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(y: Int): Int = x + y
  }
}
  
  val specialadder = specialFunction(3)
  println(specialadder(23))
  
  println(specialFunction(24)(3)) //curried function
}
/*
 * 

class Action{
  def execute(element:String):Int = element.toInt
}
* 
*/

/*
trait Action(A,B) {
  def execute(element:A):B
}
*/

trait MyFunction[A,B] {
  def apply(element: A): B
}