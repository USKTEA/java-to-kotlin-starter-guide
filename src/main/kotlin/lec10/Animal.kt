package lec10

abstract class Animal(
    val species: String,
    open val legCount: Int
) {
    abstract fun move()
}