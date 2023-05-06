package chapter4

class Person(val name: String,
             private var age: Int) {

  def addToAge(yearsToAdd: Int): Unit = {
    age = age + yearsToAdd
  }


  override def toString = s"Fruit($name, $age)"
}

object Person {
  def isLegalToDrink(person: Person, isInUSA: Boolean): Boolean = if (isInUSA) person.age >= 21 else person.age >= 18
}


