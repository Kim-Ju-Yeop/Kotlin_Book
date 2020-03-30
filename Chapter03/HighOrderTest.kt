package chap03.section3

fun main() {
    val result : Int
    val multi : (Int, Int) -> Int = {x : Int, y : Int ->
        println("x * y")
        x * y}

    result = multi(10, 20)
    println("result : $result")
}