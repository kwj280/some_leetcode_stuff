package hackerRank


fun miniMaxSum(arr: Array<Int>): Unit {
    val (min, max) = findMinMaxSum(arr)
    println("$min $max")
}


// return Pair<Min, Max>
/**
 *  arrayOf(1, 3, 5, 9, 7)
 *
 *  Pair(16, 24)
 */
const val CAPACITY = 4
fun findMinMaxSum(arr: Array<Int>): Pair<Long, Long> {
    val maxValues = ArrayList<Int>(CAPACITY) // 3, 5, 9, 7
    val minValues = ArrayList<Int>(CAPACITY) // 1, 3, 5, 7

    arr.forEach {
        if (maxValues.size < CAPACITY) {
            maxValues.add(it)
        } else {
            maxValues.replaceMinIfGreater(it)
        }

        if (minValues.size < CAPACITY) {
            minValues.add(it)
        } else {
            minValues.replaceMaxIfLess(it)
        }
    }


    var maxValue = 0L
    var minValue = 0L
    maxValues.forEach {
        maxValue += it
    }
    minValues.forEach {
        minValue += it
    }
    return Pair(minValue, maxValue)
}

// probably better to use min heap / max heap
fun ArrayList<Int>.replaceMinIfGreater(it: Int) {
    val existingMin = min()
    if (it > existingMin) {
        val idx = indexOf(existingMin)
        this[idx] = it
    }
}

fun ArrayList<Int>.replaceMaxIfLess(it: Int) {
    val existingMax = max()
    if (it < existingMax) {
        val idx = indexOf(existingMax)
        this[idx] = it
    }
}
