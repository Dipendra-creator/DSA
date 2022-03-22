import java.util.ArrayList;
import java.util.LinkedList;
import java.util.zip.CRC32;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        int CountNonZero = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                ls.add(nums[i]);
                CountNonZero += 1;
            }
        }
        for(int j = 0; j < nums.length - CountNonZero; j++){
            ls.add(0);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ls.get(i);
        }
    }
}
// @lc code=end

