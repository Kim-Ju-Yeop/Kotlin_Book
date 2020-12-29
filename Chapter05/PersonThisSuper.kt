package Chapter05

open class Person {
    constructor(firstName: String) {
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("[Person] firstName: $firstName, $age")
    }
}

class Developer : Person {
    constructor(firstName: String) : this(firstName, 10) {
        println("[Developer] firstName: $firstName")
    }

    constructor(firstName: String, age: Int) : super(firstName, age) {
        println("[Developer] firstName: $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}
