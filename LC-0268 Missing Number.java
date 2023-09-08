/**
Approach 1: Sorting
*/

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != i) return i;
        }

        return nums.length;
    }
}

/**
Approach 2: Sum Difference
*/
class Solution {
    public int missingNumber(int[] nums) {
        
        int expectedSum = 0;
        for (int i=0; i<=nums.length; i++) {
            expectedSum +=i;
        }

        int actualSum = 0;
        for (int num: nums) {
            actualSum += num;
        }

        return expectedSum-actualSum;
    }
}
