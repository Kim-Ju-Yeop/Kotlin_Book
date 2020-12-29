package Chapter05

class BirdSecondaryConstructor {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "gray"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = BirdSecondaryConstructor("myBird", 2, "short", "blue")
    coco.color = "yellow"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}