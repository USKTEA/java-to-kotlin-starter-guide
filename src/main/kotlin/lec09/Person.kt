package lec09

fun main() {
    val person = Person()

    person.age = 1009
    person.name

    println(person.name)
    println(person.isAdult)
}

class Person(
    name: String = "홍길동",
    var age: Int = 10
) {
    init {
        println("나다")
        if (age <= 0) {
            throw java.lang.IllegalArgumentException("나이는 ${age}일 수 없슴")
        }
    }

    var name = name
        set(value) {
            name = value.uppercase()
        }

    val isAdult: Boolean
        get() = this.age >= 20

    val upperCaseName: String
        get() = this.name.uppercase()


}