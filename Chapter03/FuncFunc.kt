package chap03.section3

fun main() {
    println("funcFunc : ${funcFunc()}")
}

fun sum2(a : Int, b : Int) = a + b
fun funcFunc() = sum2(2, 2)