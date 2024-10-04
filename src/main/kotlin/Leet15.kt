import java.util.*

class Leet15 {


    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     *
     * Notice that the solution set must not contain duplicate triplets.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     * Example 2:
     *
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     * Example 3:
     *
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     */
    fun threeSum(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        val res: MutableList<List<Int>> = ArrayList()
        var i = 0
        while (i < nums.size && nums[i] <= 0) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, res)
            }
            ++i
        }
        return res
    }

    fun twoSum(nums: IntArray, i: Int, res: MutableList<List<Int>>) {
        val seen = HashSet<Int>()
        var j = i + 1
        while (j < nums.size) {
            val complement = -nums[i] - nums[j]
            if (seen.contains(complement)) {
                res.add(Arrays.asList(nums[i], nums[j], complement))
                while (j + 1 < nums.size && nums[j] == nums[j + 1]) ++j
            }
            seen.add(nums[j])
            ++j
        }
    }

}
