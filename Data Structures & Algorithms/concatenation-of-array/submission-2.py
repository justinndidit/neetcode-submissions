class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        for val in range(2):
            for val in nums:
                ans.append(val)
        return ans