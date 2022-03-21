// Codestudio Coding Ninjas
// problem: Two Sum  
// https://www.codingninjas.com/codestudio/problems/two-sum_839653

import java.util.*;

public class Solution {
	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
        ArrayList<Pair<Integer, Integer>> al = new ArrayList<Pair<Integer, Integer>>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            int ith_value = arr.get(i);
            int bachakucha = target - ith_value;
            if(map.containsKey(bachakucha) && map.get(bachakucha) >= 0) {
                al.add(new Pair(ith_value, bachakucha));
                map.put(bachakucha, map.get(bachakucha) - 1);
            } else {
                map.put(ith_value, ((map.get(ith_value))==null ? 0: map.get(ith_value)+1));
            }            
        }
        if (al.size() != 0) {
            return al;
        }
        else {
            al.add(new Pair<Integer, Integer>(-1, -1));
            return al;
        }
	}
}
