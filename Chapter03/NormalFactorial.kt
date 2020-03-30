package chap03.section5

fun main() {
    val number = 4
    val result : Long

    result = factorial(number)
    println("Factorial : $number -> $result")
}

fun factorial(a : Int) : Long{
    return if(a == 1) a.toLong() else a * factorial(a - 1)
}