package ex1

fun main() {
    print("Enter the Score : ")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    if(score >= 90.0) grade = 'A'
    else if(score in 80.0..89.9) grade = 'B'
    else if(score in 70.0..79.9) grade = 'C'

    println("Score : $score, Grade : $grade")
}

fun main2(){
    print("Enter the Score")
    val score = readLine()!!.toDouble()
    var grade : Char = if(score >= 90.0) 'A'
                       else if(score in 80.0..89.9) 'B'
                       else if(score in 70.0..79.9) 'C'
                       else 'F'
    println("Score : $score, Grade : $grade")
}