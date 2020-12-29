package Chapter05

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }

    fun access() {
        privateFunc()
    }
}

class OtherClass {
    // val opc = PrivateClass()
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    // pc.i
    // pc.privateFunc()
}

fun TopFunction() {
    val tpc = PrivateClass()
}