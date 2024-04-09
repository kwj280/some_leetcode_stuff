fun removeDuplicates(nums: IntArray): Int {
    val frequencyMap = mutableMapOf<Int, Int>()
    var insertionIndex = 0
    nums.forEachIndexed { i, num ->
        if (frequencyMap[num] == null) {
            frequencyMap[num] = 1
        } else {
            frequencyMap[num] = frequencyMap[num]!! + 1
        }

        if (frequencyMap[num]!! <= 2) {
            nums[insertionIndex] = nums[i]
            insertionIndex++
        }
    }
    return insertionIndex
}