class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] resultArray = new int[2];
        for (int i = 0; i < nums.length; i++) 
        {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) 
            {
                resultArray[0] = numMap.get(complement);
                resultArray[1] = i;
                return resultArray;
            }
            
            numMap.put(nums[i], i);
        }
        return resultArray;
    }
}