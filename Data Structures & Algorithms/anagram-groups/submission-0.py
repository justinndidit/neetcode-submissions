class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result : List[List[str]] = []
        frequency: dict = {}
        for s in strs:
            new_str = "".join(sorted(s))
            if new_str not in frequency:
                frequency[new_str] = []
            frequency[new_str].append(s)
        
        count = 0
        for key in frequency:
            result.append(frequency[key])
            count += 1
        return result
        
