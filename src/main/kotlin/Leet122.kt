/**
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 */
fun maxProfit2(prices: IntArray): Int {
    var profit = 0
    prices.forEachIndexed { i, price ->
        if (i == prices.size - 1) {
            return@forEachIndexed
        }
        val nextDayPrice = prices[i + 1]
        if (nextDayPrice > price) {
            profit += nextDayPrice - price
        }

    }
    return profit
}