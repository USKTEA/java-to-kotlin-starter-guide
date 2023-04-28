package lec08

fun main() {
    println(max(1, 10))
    repeat("wow", newLine = false)
    println()
    printNameAndGender(name = "꼬부기", gender = "남자")

    val array = arrayOf("1", "2", "3")

    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(string: String,
           number: Int = 3,
           newLine: Boolean = true
) {
    for (i in 1..number) {
        if (newLine) {
            println(string)

            continue
        }

        print(string)
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}