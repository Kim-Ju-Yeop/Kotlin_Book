package Chapter05

open class Base2 {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc()
    }

    protected class Nested
}

class Derived : Base2() {
    fun test(base2: Base2): Int {
        protectedFunc()
        return i
    }
}

fun main() {
    val base2 = Base2()
    // base2.i
    // base2.protectedFunc()
    base2.access()
}