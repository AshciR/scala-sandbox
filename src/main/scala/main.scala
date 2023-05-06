import chapter4.Person

@main
def main(args: String*): Unit = {
  val bob = new Person("Bob", 18)
  def getDrinkingMessage(canDrink: Boolean, person: Person): String = {
    if (canDrink) s"${person.name} can drink beer" else s"${bob.name} can not drink beer"
  }

  println(getDrinkingMessage(Person.isLegalToDrink(bob, true), bob))

  bob.addToAge(4)
  println(getDrinkingMessage(Person.isLegalToDrink(bob, true), bob))
}

