fun maxProfit(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = Int.MIN_VALUE
    prices.forEach {
        if (it < minPrice) {
            minPrice = it
        }
        maxProfit = Math.max(maxProfit, it - minPrice)
    }
    return maxProfit
}