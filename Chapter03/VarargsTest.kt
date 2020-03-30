package chap03

fun main(){
    normalVarargs(1, 2, 3, 4)
    normalVarargs(5, 6, 7)
}

fun normalVarargs(vararg counts: Int){
    for(num in counts){
        print("$num ")
    }
    println()
}