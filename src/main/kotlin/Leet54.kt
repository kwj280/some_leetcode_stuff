class Leet54 {


    /**
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     *
     * Input: matrix = [[1,2,3,4],
     *                  [5,6,7,8],
     *                 [9,10,11,12]]
     * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
     */
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val totalSize = matrix.size * matrix[0].size
        val result = IntArray(totalSize) { 0 }

        var insertIndex = 0

        var rightBound = matrix[0].size - 1
        var leftBound = 0
        var upperBound = 0
        var downBound = matrix.size - 1
        while (insertIndex + 1 <= totalSize) {

            //move right (col + 1, row)
            for (col in leftBound..rightBound) {
                result[insertIndex] = matrix[upperBound][col]
                insertIndex++
            }

            //move down (col, row + 1)\
            for (row in upperBound + 1..downBound) {
                result[insertIndex] = matrix[row][rightBound]
                insertIndex++
            }

            //move left (col -1, row)
            if (upperBound != downBound) {
                for (col in rightBound - 1 downTo leftBound) {
                    result[insertIndex] = matrix[downBound][col]
                    insertIndex++
                }
            }

            //move up (col, row -1)

            if (rightBound != leftBound) {
                for (row in downBound - 1 downTo upperBound + 1) {
                    result[insertIndex] = matrix[row][leftBound]
                    insertIndex++
                }
            }
            rightBound--
            leftBound++
            upperBound++
            downBound--
        }
        return result.toList()
    }
}