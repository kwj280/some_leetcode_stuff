class Leet128 {

    /**
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
     *
     * You must write an algorithm that runs in O(n) time.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
     * Example 2:
     *
     * Input: nums = [0,3,7,2,5,8,4,6,0,1]
     * Output: 9
     *
     *
     *  Input: nums = [0,1,2, 100, 101, 102, 103]
     *  output: 4
     *
     *  0, 1, 2
     *  100, 101, 102, 103
     */
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = mutableSetOf<Int>()
        nums.forEach {
            numSet.add(it)
        }

        var longest = 0
        nums.forEach {
            if (!numSet.contains(it - 1)) { // current num is the smallest
                var currentNum = it
                var currentLongest = 1

                while (numSet.contains(currentNum)) {
                    currentNum++
                    currentLongest++
                    longest = Math.max(currentLongest, longest)
                }
            }

        }
        return longest
    }

}