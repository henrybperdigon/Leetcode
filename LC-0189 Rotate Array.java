class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int start = 0;
        int end = nums.length-1;

        reverse(nums, start, end);
        reverse(nums, start, k-1);
        reverse(nums, k, end);
    }

     public void reverse(int[] nums, int start, int end) {
            while (start<end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
    }
}


/**
1. Reverse the whole array.
2. Reverse the first k elements
3. Reverse the k+1 elements
*/
