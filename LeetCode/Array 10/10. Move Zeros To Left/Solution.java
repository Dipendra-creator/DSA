// Codestudio Coding Ninjas
// problem: Move Zeros To Left 
// https://www.codingninjas.com/codestudio/problems/move-zeros-to-left_1094877

public class Solution 
{
    public static void moveZerosToLeft(int[] arr, int n) 
    {
        // Write your code here!
        int j = n - 1;
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j--] = arr[i];
            }
        }
        while(j >= 0) {
            arr[j--] = 0;
        }
    }
}
