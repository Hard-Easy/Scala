package oop

object enums {
  
  enum DailyRoutine {
    case READ, WRITE, EAT, CODE, NONE
  
  def whatareyoudoing(): Unit =
    if(this==READ) println("I am reading")
    else println("I am not reading")
  }
  
  val whatsup: DailyRoutine = DailyRoutine.READ
  
  enum DailRountine(num: Int) {
    case READ extends DailyRoutine(5) //101
    case WRITE extends DailyRoutine(3) //100
    case EAT extends DailyRoutine(2) //010
    case CODE extends DailyRoutine(1) //001
    case NONE extends DailyRoutine(2) //000
  }
  def def main(args: Array[String]): Unit = {
    whatsup.whatareyoudoing()
  }
  
}