class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> subStrs = new HashMap<>();

        for(String str : strs) {
            char[] count = new char[26];
            for(char c : str.toCharArray()) count[c - 'a']++;

            if(subStrs.get(new String(count)) == null) subStrs.put(new String(count), new ArrayList<String>());
            subStrs.get(new String(count)).add(str);
        }

        return new ArrayList<>(subStrs.values());
    }
}
