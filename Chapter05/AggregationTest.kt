package Chapter05

class Duck(val name: String)
class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    val memebers: MutableList<Duck> = _members

    constructor(_name: String) : this(_name, mutableListOf<Duck>())
}

fun main() {
    val pond = Pond("myFavorite")
    val duck1 = Duck("Duck1")
    val duck2 = Duck("Duck2")

    pond.memebers.add(duck1)
    pond.memebers.add(duck2)

    for (duck in pond.memebers) {
        println(duck.name)
    }
}