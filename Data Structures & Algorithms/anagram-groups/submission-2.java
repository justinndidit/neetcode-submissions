class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> subStrs = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if(subStrs.get(sortedStr) == null) subStrs.put(sortedStr, new ArrayList<String>());
            subStrs.get(sortedStr).add(str);
        }

        for(String key : subStrs.keySet()) result.add(subStrs.get(key));
        return result; 
    }
}
