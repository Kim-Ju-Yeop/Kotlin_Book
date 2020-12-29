package Chapter05

/**
 * Car 클래스
 *
 * [Property]
 * - year (private)
 * - model (public)
 * - power (protected)
 * - wheel (internal)
 * - Driver (public), (Driver)
 *
 * [Method]
 * - start (protected)
 */

/**
 * Drvier 클래스
 *
 * [Property]
 * - name (private)
 * - license (public)
 *
 * [Method]
 * - driving (internal)
 */

/**
 * Tico 클래스
 *
 * [Property]
 * - name (public)
 * - key (private)
 * - power (protected), (override)
 * - driver (public), (Driver)
 *
 * [Method]
 * - access (public)
 */

/**
 * Burglar 클래스
 *
 * [Method]
 * - steal (public)
 */

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {

    private var year: Int = _year
    var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) println("Start the Engine!")
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var license: String = _license

        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean) : Car(_year, _model, _power, _wheel) {
    override var power: String = "50hp"
    val driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) : this(2014, "basic", "100hp", "normal", _name, _key) {
        name = _name
        key = _key
    }

    fun access(password: String) {
        if (password == "gotico") {
            println("----[Tico] access()----")
            println("super.model : ${super.model}")
            println("super.power : ${super.power}")
            println("super.wheel : ${super.wheel}")
            super.start(key)

            println("Driver().license = ${driver.license}")
            driver.driving()
        } else {
            println("You're a burglar")
        }
    }
}

class Burglar {
    fun steal(anycar : Any) {
        if (anycar is Tico) {
            println("----[Burglar] steal()----")
            println("anycar.name : ${anycar.name}")
            println("anycar.wheel : ${anycar.wheel}")
            println("anycar.model : ${anycar.model}")

            println(anycar.driver.license)
            anycar.driver.driving()
            anycar.access("dontknow")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main() {
    val tico = Tico("Kildong", true)
    tico.access("gotico")

    println()

    val burglar = Burglar()
    burglar.steal(tico)
}