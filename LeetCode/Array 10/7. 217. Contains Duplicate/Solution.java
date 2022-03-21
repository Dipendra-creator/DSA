// Leetcode
// problem: 217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        } 
        if (nums.length != set.size()) {
            return true;
        }
        else {
            return false;
        }
    }
}
