import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int sizeArr = heights.length, count = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < sizeArr; i++) {
            System.out.print(heights[i]+" ");
            arr.add(heights[i]);
            // arr.set(i, heights[i]);
        }

        Arrays.sort(heights);

        for (int i = 0; i < sizeArr; i++) {
            if (arr.get(i) != heights[i])
                count += 1;
        }

        return count;
    }
}
// @lc code=end

