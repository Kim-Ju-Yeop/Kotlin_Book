package Chapter05

class Car2(val name: String, val power: String) {
    private var engine2 = Engine2(power)

    fun startEngine2() = engine2.start()
    fun stopEngine2() = engine2.stop()
}

class Engine2(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car2 = Car2("tico", "100hp")
    car2.startEngine2()
    car2.stopEngine2()
}