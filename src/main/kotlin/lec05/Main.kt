package lec05

fun validate(score: Int) {
    if (score < 0) {
        throw java.lang.IllegalArgumentException("{$score}는 0 보다 작을 수 없다")
    }
}

fun passOrNot(score: Int) : String {
    return if (score >= 50) "P" else "F"
}

fun getGrade(score: Int) : String {
    if (score !in 0..100) {
        throw java.lang.IllegalArgumentException("${score}범위는 0부터 100이다")
    }

    return "A"
}

fun getGradeSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("와 이게 되네")
        else -> println("와우")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("이게 된다고?")
        number % 2 == 0 -> println("신기방기")
        else -> println("짱이구나")
    }
}