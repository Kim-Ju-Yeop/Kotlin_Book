package chap03.section3

fun main() {

    noParam ({ a -> "Hello World! $a" })
    noParam { a -> "Hello World! $a" }
    noParam { "$it" }
}

fun noParam(out : (String) -> String) = println(out("OneParam"))