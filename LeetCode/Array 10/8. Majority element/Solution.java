// Codestudio Coding Ninjas
// problem: Majority element 
// https://www.codingninjas.com/codestudio/problems/majority-element_842495

import java.util.*;

public class Solution {
    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int max = 0;
        int key = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        if (max > n/2) {
            return key;
        } else {
            return -1;
        }
    }
}
