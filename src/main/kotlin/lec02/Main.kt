package lec02

import com.lannstark.lec02.Person

fun main() {
    val person = Person(null)

    startsWithA1(person.name)
}

fun startsWithA1(string: String): Boolean {
    return string?.startsWith("A")
}
