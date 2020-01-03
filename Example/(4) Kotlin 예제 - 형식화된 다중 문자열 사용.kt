package chap02.section2

// """ 형식화된 문자열을 이용한 예제입니다.
fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
    """.trimIndent()
    println(formattedString)
}