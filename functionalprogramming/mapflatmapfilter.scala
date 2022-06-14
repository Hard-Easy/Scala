package functionalprogramming

object mapflatmapfilter extends App{
  
  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)
  
  //map
  println(list.map(_+1))
  println(list.map(_ + " is a number"))
  
  //filter
  
  //println(list.filter(_ % 2 == 0))
  
  //flatmap
  
  val toPair = (x: Int) => List(x, x+1)
  //println(list.flatMap(toPair))
  
  //print out all combinations between tow lists
  
  val numbers = List(1, 2, 3, 4)
  val chars = List('a','b','c','d')
  val colors = List("Black","Blue","Green")
  
  val combination = numbers.flatMap(n => chars.map(c => "" + c + n))
  //println(combination)
  
  val combination1 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => ""+ n + c+ color)))
  
  //println(combination1)
  
  list.foreach(println)
  
  //for-comprehensions
  val forCombinations = for{
    n <- numbers
    c <- chars
    color <- colors
  } yield "" + n + c + color
  
  //forCombinations.foreach(println)
  
   val forCombinations1 = for{
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + n + c + color
  
  //forCombinations1.foreach(println)
  
  println("-----------------------------")
  
  for {
    n <- numbers
  } println(n)
  
  println("-----------------------------")
  
  val list4 = list.map { x =>
    x * 2 
  }
  list4.foreach(println)
  
}