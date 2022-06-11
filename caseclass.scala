package oop

object caseclass extends App{
  
  /*
   * equal, hashcode, toString
   */
  
  case class Person(name: String, age:Int)
  
  val raj = new Person("Raj",18)
  
  println(raj.name)    //Raj
  println(raj.toString)  //Person(Raj,18)
  println(raj)           //Person(Raj,18)
  
  
  //equals and hashCode implemented 
  val raj2 = new Person("Raj",18)
  println(raj==raj2)  //true
  
  //it has handy copy method
  
  val raj3 = raj.copy()
  println(raj3)
  
  val raj4 = raj.copy(age=25)
  println(raj4)
  
  // case less has companion objects
  
  val thePerson = Person
  
  val natasha = Person("Natasha", 10)
  
  //case class are serializable and it can be used in pattern matching. 
  
  case object America {
    def name: String = " America"
  }
  
}