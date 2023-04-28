package lec07

fun parseInt(string: String): Int? {
    return try {
        string.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}