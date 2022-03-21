// Leetcode
// problem: 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(Integer integer : prices) {
            if(integer < min) {
                min = integer;
            }
            else if (integer > max+min) {
                max = integer-min;
            }
        }
        return max;
    }
}
