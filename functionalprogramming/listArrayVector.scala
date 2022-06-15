package functionalprogramming

import java.util.Random

object listArrayVector extends App{
  
  //Seq
  val aSequence = Seq(1, 2, 3, 0)
  println(aSequence)                 //List(1, 2, 3)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(4, 5, 6))
  println(aSequence.sorted)
  
  //ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)  
  
  
  (1 to 10).foreach(println)
  (1 to 10).foreach(x => println(x +10))
  
  //List
  println("--------------------------------------------------")
  val aList = List(1, 2, 3)
  
  val prepended = 42 :: aList
  val prepost = 42 +: aList :+ 85
  println(prepended)
  println(prepost)
  
  val apples5 = List.fill(5)("apple")
  println(apples5)
  
  println(aList.mkString("-"))
  
  println("--------------------------------------------------")
  
  val numbers = Array(1, 2, 3)
  val threeElements = Array.ofDim[Int](3)
  threeElements.foreach(println)
  
  val threeString = Array.ofDim[String](3)
  threeString.foreach(println)
  
  //mutation
  numbers(2) = 0 // syntax sugar for numbers.update(2, 0)
  println(numbers.mkString(" "))
  
  // arrays and seq
  
  val numbersSeq: Seq[Int] = numbers //implicit conversion
  
  println(numbersSeq)  //WrappedArray(1, 2, 0)
  
  //Vector
  //The default implementation for immutable sequences
  //1. effectively constant indexed read and write: O(log32(n))
  //2. fast element addition: append/prepend
  
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)
  
  //vector vs list
  
  val maxRun = 1000
  val maxCapacity = 10000
  
  def getWriteTime( collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      i <- 1 to maxRun
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), 0)
      
      System.nanoTime() - currentTime
    }
    
    times.sum * 1.0 / maxRun
    
  }
  
  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector
  
  println(getWriteTime(numbersList))
  println(getWriteTime(numbersVector))
   
  
  
}