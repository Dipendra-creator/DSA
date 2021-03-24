import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        int size = nums.length, largest = 0;
        Arrays.sort(nums);
        if (size < 1){
            return 0;
        }
        else if (size == 1){
            return nums[0];
        }
        else if (size == 2){
            for (int i = 0; i < 2; i++) {
                if (largest < nums[i])
                    largest = nums[i];
            }
        }
        else{
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(nums[0]);
            for (int i = 1; i < size; i++) {
                if(arr.get(i-1) == nums[i]){
                    continue;
                }else{
                    arr.add(nums[i]);
                }
            }
            largest = arr.get((arr.size() - 3));
        }
        return largest;
    }
}
// @lc code=end

