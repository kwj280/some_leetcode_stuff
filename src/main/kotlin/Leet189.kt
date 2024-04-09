/**
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
fun rotate(nums: IntArray, k: Int): Unit {
    val shift = nums.size - (k % nums.size)
    val left = nums.slice(0..<shift)
    val right = nums.slice(shift..<nums.size)
    right.forEachIndexed { i, num ->
        nums[i] = num
    }
    left.forEachIndexed { i, num ->
        nums[i + right.size] = num
    }
}