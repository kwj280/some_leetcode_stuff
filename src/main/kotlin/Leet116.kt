class Leet116 {


    class Node(var `val`: Int) {
        var left: Node? = null
        var right: Node? = null
        var next: Node? = null
    }

    /**
     * You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
     *
     * struct Node {
     *   int val;
     *   Node *left;
     *   Node *right;
     *   Node *next;
     * }
     * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
     *
     * Initially, all next pointers are set to NULL.
     *
     * Input: root = [1,2,3,4,5,6,7]
     * Output: [1,#,2,3,#,4,5,6,7,#]
     * Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
     *
     */

    fun connect(root: Node?): Node? {
        if (root == null) {
            return null
        }
        bfs(root)
        return root
    }

    fun bfs(node: Node?) {
        if (node == null) {
            return
        }
        val queue = ArrayDeque<Node?>()
        queue.addLast(node)
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0..<size) {
                val currentNode = queue.removeFirst()

                if (i < size - 1) {
                    currentNode?.next = queue.firstOrNull()
                }
                if (currentNode?.left != null) {
                    queue.addLast(currentNode.left)
                    queue.addLast(currentNode.right)
                }
            }
        }
    }
}