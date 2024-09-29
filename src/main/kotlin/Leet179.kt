class Leet179 {

    /**
     *
     * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
     *
     * Since the result may be very large, so you need to return a string instead of an integer.
     *
     * Example 1:
     *
     * Input: nums = [10,2]
     * Output: "210"
     * Example 2:
     *
     * Input: nums = [3,30,34,5,9]
     * Output: "9534330"
     *
     */
    fun largestNumber(nums: IntArray): String {
        val sorted = mergeSort(nums, 0, nums.size - 1)
        var str = ""
        sorted.forEach {
            str += it.toString()
        }
        return if (str[0] == '0') {
            "0"
        } else {
            str
        }
    }

    /**
     * Input: nums = [3,30,34,5,9]
     * Output: [9,5,34,3,30]
     */
    private fun mergeSort(nums: IntArray, left: Int, right: Int): IntArray {

        if (left >= right) {
            return intArrayOf(nums[left])
        }
        val mid = left + (right - left) / 2
        val leftHalf = mergeSort(nums, left, mid)
        val rightHalf = mergeSort(nums, mid + 1, right)
        return merge(leftHalf, rightHalf)
    }


    private fun merge(arr1: IntArray, arr2: IntArray): IntArray {
        var firstIdx = 0
        var secondIdx = 0
        val result = mutableListOf<Int>()

        while (firstIdx < arr1.size && secondIdx < arr2.size) {
            val first = arr1[firstIdx].toString()
            val second = arr2[secondIdx].toString()
            if ((first + second) > (second + first)) {
                result.add(first.toInt())
                firstIdx++
            } else {
                result.add(second.toInt())
                secondIdx++
            }
        }
        // append remaining
        while (firstIdx < arr1.size) {
            result.add(arr1[firstIdx])
            firstIdx++
        }
        while (secondIdx < arr2.size) {
            result.add(arr2[secondIdx])
            secondIdx++
        }
        return result.toIntArray()
    }
}