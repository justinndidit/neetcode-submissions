class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
        output = ""
        for i, char in enumerate(strs[0]):
            for val in strs[1:]:
                if i >= len(val) or char != val[i]:
                    return output
            output += char
        return output