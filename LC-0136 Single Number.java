/**
Approach 1: List operation
Algorithm

Iterate over all the elements in nums\text{nums}nums
If some number in nums\text{nums}nums is new to array, append it
If some number is already in the array, remove it
*/
class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> numList = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (!numList.contains(nums[i])) {
                numList.add(nums[i]);
            } else {
                numList.remove(new Integer (nums[i]));
            }
        }

        return numList.get(0);
    }
}
/**
Approach 4: Bit Manipulation
If we take XOR of zero and some bit, it will return that bit
If we take XOR of two same bits, it will return 0
So we can XOR all bits together to find the unique number.
*/
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
