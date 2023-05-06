package chapter3

@main
def main(): Unit = {
  //  arrayExample()
  //  listExample()
  //  tupleExample()
  //  setExample()
  //  mapExample()
  optionalValues()
}

def optionalValues(): Unit = {

  val names = List("Richie", "Sasha", "Daniel")
  val nameWithR = names.find(n => n.startsWith("R"))
  val nameWithZ = names.find(n => n.startsWith("Z"))

  println(nameWithR.map(n => n.toLowerCase()))
  println(nameWithZ.map(n => n.toLowerCase()))

}

def mapExample(): Unit = {
  val drinks = Map(
    1 -> "Coffee",
    2 -> "Tea",
    3 -> "Chai",
  )
  println(drinks)
  println(drinks(2))
}

def setExample(): Unit = {
  val cities = Set("Kingston", "Miami", "Vegas")
  println(cities)
  val moreCities = cities + "Raleigh"
  println(moreCities)
}

def tupleExample(): Unit = {
  val pair = ("Richie", 30)
  println(pair)
}

def listExample(): Unit = {
  val listA = List(1, 2, 3, 4)

  val listB = List(5, 6, 7, 8)

  // concats the list
  println("Concat list")
  println(listA ::: listB)

  // Cons operator adds element to the start of the list
  println("Cons list")
  println(0 :: listA)


}

def arrayExample(): Unit = {
  val greetStrings = new Array[String](3)

  greetStrings(0) = "Hello "
  greetStrings(1) = "Richie "
  greetStrings(2) = "World "


  for i <- 0 to 2 do
    print(greetStrings(i))
}

