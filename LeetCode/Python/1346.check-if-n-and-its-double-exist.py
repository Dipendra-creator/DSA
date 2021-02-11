#
# @lc app=leetcode id=1346 lang=python3
#
# [1346] Check If N and Its Double Exist
#

# @lc code=start
class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                if(arr[i] == arr[j]*2 or arr[i]*2 == arr[j]):
                    return True
        return False

# @lc code=end

