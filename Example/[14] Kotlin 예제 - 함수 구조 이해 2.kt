package chap03

fun main() {
    val num1 = 10
    val num2 = 3
    val result : Int

    result = max(num1, num2)
    println(result)
}

fun max(a : Int, b : Int) = if(a > b) a else b
