class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

/**

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
BRUTE FORCE - Iterate for all possible pairs and if the sum is 9 return their indices (On*n)

Iterate over array getting the compliment by subracting the target with the element
if map does not contain the compliment as key, store in HashMap with element as key and value as current index
if map contains the compliment as key, return the value and current index
*/










