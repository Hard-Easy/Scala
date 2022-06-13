package oop

object exception extends App{
  
  val x:String = null
  //println(x.length)
  // above line will crash wit null pointer exception
  
  //throwing and catching exceptions
  
  //1. throw exception
  
  //val aexption: String = throw new NullPointerException
  
  // throwable classes extends the Throwable class.
  // Exception and Error are the major Throwable subtypes
  
  //2. how to catch excetpion
  
  def getInt(withExecptions:Boolean):Int =
    if (withExecptions) throw new RuntimeException("it is not working boss!")
    else 34
    
  try{
      //code that may fail
      getInt(true)
    } catch {
      case e:RuntimeException => println("got runtime error boss")
    } finally{
      println("I am there for you")
    }
  
    //How to define your own exceptions
    //just create a class and extends with Exception like below
    /*
    
    class MyException extends Exception
    val exception = new MyException
    throw exception
    
    */
    
    /*
     * 1. Crash your program with an OutOfMemoryError
     * 2. Crash with SOError
     * 3. PocketCalculator
     * - add(x,y)
     * -subtract(x,y)
     * -multiple(x,y)
     * -divide(x,y)
     * Throw
     * - overflowException if add(x,y) exceeds Int.MAX_VALUE
     * - Underflow exception if below Int.MAX_VALUE
     * -divide by 0 error
     * 
     
     * 
     */
    
    //val array = Array.ofDim(Int.MaxValue) //exception example
    
    //def infinite:Int = 1 + infinite
    //val noLImit = infinite
    class OverException extends Exception
    class UnderException extends Exception
    
    object PocketCalculator{
      def add(x: Int, y:Int) = {
        val result = x + y
        if (x>0 && y>0 && result<0) throw new OverException // when we add a positive number like 9 to max possible value then it return negative value so that's the check if both input are positive and output is negative that means it overflow case.
        else if (x <0 && y <0 && result >0) throw new UnderException
        else result
      }
      
      def subtract(x:Int, y:Int): Int = {
        val result = x - y
        if (x>0 && y <0 && result<0) throw new OverException
        else if(x <0 && y>0 && result >0) throw new UnderException
        else result
      }
      
      
    }
    println(PocketCalculator.add(5,6))
    
}