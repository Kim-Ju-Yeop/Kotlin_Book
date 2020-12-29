package Chapter05

open class BirdOverrideEx(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Parrot2(name: String, wing: Int = 2, beak: String, color: String, var language: String = "natural") : BirdOverrideEx(name, wing, beak, color) {
    fun speak() = println("Speak! $language")
    override fun sing(vol: Int) {
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot2(name = "myParrot", beak = "short", color = "multiple")
    parrot.language = "English"

    println("Parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}