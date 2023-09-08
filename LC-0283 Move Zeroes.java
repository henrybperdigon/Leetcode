class Solution {
    public void moveZeroes(int[] nums) {
     
        int j = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while (j<nums.length) {
            nums[j++] = 0;
        }
        
    }
}

/**
fill up the same array with non-zeros by a new index j
replace the remaining spaces with zeroes from j+1
*/
