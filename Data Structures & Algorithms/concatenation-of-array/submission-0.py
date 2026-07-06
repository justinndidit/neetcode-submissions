class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        for val in range(len(nums) * 2):
            if val >= len(nums):
                val = val %len(nums)
            ans.append(nums[val])

        return ans