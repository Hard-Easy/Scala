package oop

//in abstract class we don't pass value to variable and don't have method defination for method
// the reason is so that subclass will implement these thing and will not forget to do so.
//1. abstract class not be initiated. cannot create a object of abstract class. 
//2. best part create a sub class of abstract class. 

//3. there is trait which is similar to abstract but we can inherit abstract with trait 

// what is difference between abstract and trait 
// traits do not have constructor parameter. trait PartyTime(name:Sting) will be incorrect
// multiple trait can be inherit by same class
// traits = behavior(what they do), abstract class = "thing" (what is it, like dog or something else)

object abstractclass extends App{
  
  abstract class Animal {
    val creatureType: String //not passing any value
    def eat: Unit    //method has not been implemented
  }
  
  class dog extends Animal {
    override val creatureType: String = "Pet"
    override def eat():Unit = println("let me think what i wanted to eat")
  }
  
  trait PartyTime{
    def eat(choco : String) : Unit
  }
  
  val mydog = new dog
  mydog.eat()
  
  class partydog extends Animal with PartyTime{
    override val creatureType:String = "Party dog"
    override def eat():Unit = println("this is party time man")
    override def eat(choco:String): Unit = println("Party with "+choco)
  }
  
  val dog1 = new partydog
  dog1.eat()
  dog1.eat("Chocolate")
  
}
