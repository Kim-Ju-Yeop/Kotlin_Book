package chap03.section3

fun main() {
    val result = callByValue(lambda()) // lambda() 람다식 함수 호출
    println(result)
}

fun callByValue(b : Boolean) = b

val lambda : () -> Boolean = {true} // lambda 일반 변수에 람다식 함수 적용