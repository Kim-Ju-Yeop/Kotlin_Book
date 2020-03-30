package chap02.section2

// $ 표시를 이용하여 변수에 있는 내용을 출력하는 예제입니다.
fun main() {

    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}"

    println("str1 : \"$str1\", str2 : \"$str2\"")
}