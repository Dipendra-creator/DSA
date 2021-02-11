#
# @lc app=leetcode id=26 lang=python3
#
# [26] Remove Duplicates from Sorted Array
#

# @lc code=start
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = len(nums)

        i = 0
        dup = 0
        for j in range(1,count):
            # print(j)
            if(nums[i] != nums[j]):
                i += 1
                nums[i] = nums[j]
            else:
                dup += 1
        print(dup)
        for i in range(dup):
            nums.pop(-1)
        
# @lc code=end

