package oop
import basics.friends
import java.util.Date
import java.sql.{Date =>SqlDate}

object packageandimport extends App{
  
  val friend = new friends //import friends from basics package
  friend.sayHi()
  val newOne = new basics.friends // full qualifier no need to import anything
  
  newOne.sayHi()
  
  //package object which will help to get method without class import , one package object each package
  // which can be access through out the package without import, Awesome isn't it?
  //whatyousay value I have defined in package.scala and without import i can use under this package oop
  
  println(whatyousay)
  
  //packagename._ to import everything
  //packagename.{abc,aaa} to import these 2 
  
  //alice package name so that if you have 2 package with same name then you can give a custom name
  
  //import packagename => newpackagename
  //import packagename.{module1, module2=>newnameformodule2}
  
  //default imports
  //java.lang - String, Object, Exception
  //scala.Predef = println, ???
  
  
}