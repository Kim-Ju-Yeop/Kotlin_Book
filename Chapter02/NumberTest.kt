package chap02.section3

fun main() {
    var test : Number = 12.2 // Number 스마트 캐스트 자료형 사용

    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")
}