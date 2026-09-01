class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute force solution
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        //Optimized using HashTable

        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];

            if(seen.get(difference) != null) return new int[]{seen.get(difference), i};
            seen.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
