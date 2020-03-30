package chap03

fun main() {

    val name = "김주엽"
    val email = "kjy031104@gmail.com"

    add(name)
    add(name, email)
    add("이영은", "eun3679@gmail.com")

    defaultArgs()
    defaultArgs(200)
}

fun add(name : String, email : String = "default"){
    val outPut = "${name}님의 이메일은 ${email}입니다."
    println(outPut)
}

fun defaultArgs(x : Int = 100, y : Int = 200){
    println(x + y)
}