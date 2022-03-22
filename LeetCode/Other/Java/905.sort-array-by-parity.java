import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int arrSize = A.length, count = 0;
        System.out.println(arrSize);
        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 0; i < arrSize; i++) {
            if (A[i] % 2 == 0){
                arr.add(count, A[i]);
                count +=1;
            }
        }
        for (int i = 0; i < arrSize; i++) {
            if (A[i] % 2 != 0){
                arr.add(count, A[i]);
                count +=1;
            }
        }
        for (int i = 0; i < arrSize; i++) {
            A[i] = arr.get(i);
        }
        return A;
    }
}
// @lc code=end

