package functionalprogramming

object anonymousfunction extends App{
  
  /*
   * Object orient way to define functional program like below
   *   val tripler = new Function1[Int, Int] {
    override def apply(x: Int) = x * 3
  }
   */
  //above code we can write in very simplified way as below
  //no need to write extra line to override def
  //we can say lambda 
  
  val tripler = (x: Int) => x * 3
  val tripler1: Int => Int = x => x *3
  
  //multi parameter in lambda
  val adder: (Int, Int) => Int = (a:Int, b:Int) => a+b
  
  //no parameter
  
  val justnothing: () => Int = ()=>3 
  
  println(justnothing) // funciton itself 
  println(justnothing()) // lambda function call we need to use functionname() for lambda call
  
  // curly braces with lambdas
  
  val intToString = { (intervalue: Int) =>
    intervalue.toString
    
  }
  
  //syntatic sugar
  
  val niceIncrementer: Int => Int = (x:Int) => x + 1
  val niceshortcut: Int => Int = _ + 1 // equivalent of x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ //equivalent of (a,b) => a + b
  
  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(4)(12))
  
  

  
}