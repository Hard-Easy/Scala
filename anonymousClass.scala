package oop

object anonymousClass extends App{
  
  abstract class Animal {
    def dance: Unit
  }
  
  //anonymous class
  
  val dancingAnimal: Animal = new Animal {
    override def dance: Unit = println("super dancing")
  }
  /*
   above one equivalent with 
   class class anonymousClass$$anon$1 extends Animal {
   override def dance: Unit = println("super dancing")
   }
   
   val dancingAnimal: Animal = new anonymousClass$$anon$1
   */
  
  println(dancingAnimal.getClass) //class oop.anonymousClass$$anon$1
  
  class Person(name: String) {
    def sayHi : Unit = println(s"Hi my name is $name, how can I help?")
  }
  
  val raj = new Person("Raj") {
    override def sayHi: Unit = println("Hi my name is raj")
  }
  raj.sayHi
}