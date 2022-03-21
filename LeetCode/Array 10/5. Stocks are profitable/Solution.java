// Codestudio Coding Ninjas
// problem: Stocks are profitable   
// https://www.codingninjas.com/codestudio/problems/stocks-are-profitable_893405?leftPanelTab=0

import java.util.*;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
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