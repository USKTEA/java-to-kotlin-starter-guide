package lec10

interface Swimable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("수영수영")
    }
}