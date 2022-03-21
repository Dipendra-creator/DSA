// Codestudio Coding Ninjas
// problem: Occurs Once   
// https://www.codingninjas.com/codestudio/problems/occurs-once_1214969

public class Solution {
    public static int occursOnce(int[] a, int n) {
        // Write your code here.
        int res = 0;
        for (int i = 0; i < n; i++)
            res = res^a[i]; // Using Bitwise XOR or Bitwise Exclusive OR (^)
        return res;
    }
}
