class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();

    for (int i=0; i<nums.length; i++) {
        if (!map.containsKey(nums[i])) {
            map.put(nums[i], 1);
        } else {
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        if (map.get(nums[i]) > (nums.length/2)) return nums[i];
    }

    return 0;  
    }
}

//Iterate thru array
//Track the count of each element
//Per iteration, check if count > array length/2 (condition for Majority element)
//Return true, else return 0
