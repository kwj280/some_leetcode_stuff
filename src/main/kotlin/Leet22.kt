class Leet22 {

    /**
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     *
     * Example 1:
     *
     * Input: n = 3
     * Output: ["((()))","(()())","(())()","()(())","()()()"]
     * Example 2:
     *
     * Input: n = 1
     * Output: ["()"]
     *
     *
     * n = 2
     * ["(())", "()()"]
     *
     */
    val cache = mutableSetOf<String>()

    fun generateParenthesis(n: Int): List<String> {
        if (n == 0) {
            return listOf("")
        }

        var answer = mutableListOf<String>("()")
        for (i in (2..n)) {
            answer = addParenthesis(answer)
        }

        return answer
    }

    fun addParenthesis(list: MutableList<String>): MutableList<String> {
        val added = mutableListOf<String>()
        list.forEach {
            for (idx in it.indices) {
                val str = it.substring(0..<idx) + "()" + it.substring(idx)
                if (!cache.contains(str)) {
                    cache.add(str)
                    added.add(str)
                }
            }
        }
        return added
    }

}