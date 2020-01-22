package chap03.section5

fun main() {
    val number = 5
    println("Factorial : $number -> ${factorial2(number)}")
}

tailrec fun factorial2(a : Int, run : Int = 1) : Long{
    return if(a == 1) run.toLong() else factorial2(a - 1, a * run)
}