public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if (nums[i] == i + 1) {
                i ++;
                continue;
            }
            int index = nums[i] - 1;
            if (nums[index] == index + 1) {
                i ++;
                continue;
            }
            nums[i] = nums[index];
            nums[index] = index + 1;
        }
        List<Integer> result = new LinkedList<Integer>();
        for (int j = 0; j < nums.length; j ++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;
    }
}