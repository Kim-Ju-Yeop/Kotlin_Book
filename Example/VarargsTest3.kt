package chap03

fun main(){
    normalVarargs2(1, 2, 3, 4)
    normalVarargs2(5, 6, 7)
}

fun normalVarargs2(vararg counts: Int){
    for(num in counts){
        print("num : $num ")
    }
    println()
}