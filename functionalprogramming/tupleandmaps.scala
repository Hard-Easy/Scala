package functionalprogramming

object tupleandmaps extends App{
  
  //tuples is finite ordered "lists"
  val aTuple = new Tuple2(2, "hello, Scala") //Tuple2[Int, String] = (Int, String)
  
  println(aTuple._1)
  println(aTuple.copy(_2 = "Bye Bye"))   //(2,Bye Bye)
  println(aTuple.swap)         //(hello, Scala,2)
  
  //Maps - keys -> values
  val aMap: Map[String, Int] = Map()
  
  val phonebook = Map(("Raj", 4545), "Rani" -> 451256, "John Doe" -> 1234566)
  // a -> b is super for (a, b)
  println(phonebook)
  
  //map operations
  println(phonebook.contains("Raj"))
  println(phonebook("Raj"))
  
  //if key is missing we will get default value
  val phonebook1 = Map(("Raj", 4545), "Rani" -> 451256).withDefaultValue(-1)
  println(phonebook1.contains("Raja"))
  println(phonebook1("Raja"))
  
  //adding new key and value pairs
  
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)
  
  //functionals on maps
  //map, flatMap, filter
  
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))
  
  //filterKeys
  
  println(phonebook.filterKeys(x=> x.startsWith("J")))
  
  //mapValues
  
  println(phonebook.mapValues(number => number * 10))
  
  //conversions
  
  println(phonebook.toList)
  println(List(("Aaa", 45452)).toMap)
  
  val names = List("Bob", "James", "Angel", "John")
  
  println(names.groupBy(name => name.charAt(0)))
  
  
}