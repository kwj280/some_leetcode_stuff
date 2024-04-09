package hackerRank


const val HACKER_RANK = "hackerrank"

fun hackerrankInString(s: String): String {
    val stack = ArrayDeque<Char>(HACKER_RANK.length)
    HACKER_RANK.reversed().forEach {
        stack.addLast(it)
    }

    s.forEach {
        if (stack.isEmpty()) {
            return@forEach
        }
        if (stack.last() == it) {
            stack.removeLast()
        }
    }

    return if (stack.isEmpty()) "YES" else "NO"
}
