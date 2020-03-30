package chap03.section6

fun a() = b()
fun b() = println("b")

fun c(){
    // fun d() = e() e 함수가 누구인지 모른다.
    fun e() = println("e")
}

fun main() {
    a()
    // e() e 함수는 c 함수의 지역 함수이다보니 접근을 못한다.
}