# TODO: Time Limit Exceed in biggest Test case
# @lc app=leetcode id=1299 lang=python3
#
# [1299] Replace Elements with Greatest Element on Right Side
#

# @lc code=start
class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        N = len(arr)
        l = 0

        for i in range(N):
            l += 1
            j = max(arr[l,N])
            arr[i] = j
            # for j in range(l, N):
            #     if arr[i] < arr[j]:
            #         arr[i] = arr[j]
            if i>0:
                arr[i-1] = arr[i]
        
        arr[N-1] = -1
        
        return arr
        
        
# @lc code=end

