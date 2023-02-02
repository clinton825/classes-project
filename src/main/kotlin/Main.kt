fun main(args: Array<String>) {
    val person1 = Person("Mark","Roche")
    val person2 = person1.copy(firstName = " Clare")
    val person3 = person1.copy(firstName = "James")
    println(person1)
    println(person2.toString())
    println(person3)


}