package chap03.section6

var global = 10 // 전역 변수

fun main() {

    // main 함수 안의 지역 변수
    val local1 = 20
    val local2 = 21

    fun nestedFunc(){
        global += 1
        val local1 = 30

        println("nestedFunc local1 : $local1") // nestedFunc 지역 함수의 지역 변수 local1 호출
        println("nestedFunc local2 : $local2") // main 함수 안의 지역 변수 local2 호출
        println("nestedFunc global : $global") // 지역 변수 global 호출
    }

    nestedFunc()
    outsideFunc()

    println("main global : $global") // 전역 변수 global 호출
    println("main local1 : $local1") // main 함수 안의 지역 변수 local1 호출
    println("main local2 : $local2") // main 함수 안의 지역 변수 local2 호출
}

fun outsideFunc(){
    global += 1
    val outVal = "outside"

    println("outsideFunc global : $global") // 전역 변수 global 호출
    println("outsideFunc outVal : $outVal") // outsideFunc 함수 지역 변수 outVal 호출
}



