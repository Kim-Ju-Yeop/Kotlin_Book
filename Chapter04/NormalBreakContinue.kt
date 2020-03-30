package ex3

fun main() {
    for(i in 1..5){
        if(i == 3) break
        print(i)
    }
    println()
    println("outside")
}