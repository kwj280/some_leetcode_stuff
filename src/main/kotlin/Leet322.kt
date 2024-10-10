class Leet322 {

    /**
     * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
     *
     * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
     *
     * You may assume that you have an infinite number of each kind of coin.
     *
     *
     *
     * Example 1:
     *
     * Input: coins = [1,2,5], amount = 11 dp[5] + dp[6]
     * Output: 3
     * Explanation: 11 = 5 + 5 + 1
     * Example 2:
     *  [0,1,1,2,0,1,2,0,0,0,3]
     *
     *
     * Input: coins = [2], amount = 3
     * Output: -1
     * Example 3:
     *
     * Input: coins = [1], amount = 0
     * Output: 0
     *
     *
     *
     */

    fun coinChange(coins: IntArray, amount: Int): Int {

        val dp = IntArray(amount + 1) { amount + 1 }
        dp[0] = 0
        coins.sort()
        for (a in 0..amount) {
            coins.forEachIndexed { i, coin ->
                if (coin <= a) {
                    dp[a] = Math.min(dp[a], dp[a - coin] + 1)
                }
            }
        }


        return if (dp[amount] > amount) {
            -1
        } else {
            dp[amount]
        }
    }
}