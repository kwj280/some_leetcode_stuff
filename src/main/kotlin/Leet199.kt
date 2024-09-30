class Leet199 {

    /**
     * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
     * Example 1:
     * Input: root = [1,2,3,null,5,null,4]
     * Output: [1,3,4]
     *
     * Example 2:
     * Input: root = [1,null,3]
     * Output: [1,3]
     *
     * Example 3:
     * Input: root = []
     * Output: []
     *
     */
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        dfs(root, result, 0)
        return result
    }


    fun dfs(root: TreeNode?, result: MutableList<Int>, depth: Int) {
        if (root == null) {
            return
        }
        if (result.size <= depth) {
            result.add(depth, root.`val`)
        }
        dfs(root.right, result, depth + 1)
        dfs(root.left, result, depth + 1)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}