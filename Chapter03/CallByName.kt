package chap03.section3

fun main() {
    val result = callByName(otherLambda) // otherLambda 변수 람다식 이름으로 호출
    println(result)
}

fun callByName(b : () -> Boolean) = b() // 매개변수 b 즉 otherLambda 람다식 함수 호출

val otherLambda = {true}