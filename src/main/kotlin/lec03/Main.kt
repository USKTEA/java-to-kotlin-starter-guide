package lec03

import com.lannstark.lec03.Person

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    age(Person("", 100))

    val person = Person("김뚜루", 100)

    println("이름 ${person.name}, 나이 ${person.age}")

    val string = """
        ABCD
        EFG
        ${person.name}
    """.trimIndent()
    println(string)

    val abc = "ABC"

    println(abc[0])
}

fun age(obj: Any?) {
    if (obj is Person) {
        println(obj.age)
    }

    val person = obj as? Person

    println(person?.age ?: 20)
}