package Chapter05

open class BirdChildClasses(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

class Lark(name: String, wing: Int, beak: String, color: String) : BirdChildClasses(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}

class Parrot : BirdChildClasses {
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, _language: String) : super(name, wing, beak, color) {
        language = _language
    }

    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = BirdChildClasses("myBird", 2, "short", "blue")
    val lark = Lark("myLark", 2, "long", "brown")
    val parrot = Parrot("myParrot", 2, "short", "multiple", "korean")

    println("Coco : ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark : ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    lark.singHitone()
    parrot.speak()
}