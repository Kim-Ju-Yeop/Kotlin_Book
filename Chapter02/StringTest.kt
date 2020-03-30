package chap02.section2

// String 문자열 선언 및 할당을 하면서 값을 비교한 예제입니다.
fun main() {

    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2 : ${str1 === str2}")
    println("str1 === str3 : ${str1 === str3}")
}