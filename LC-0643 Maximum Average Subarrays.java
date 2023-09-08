class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;
        int start = 0;

        for (int end = 0; end<nums.length; end++) {
            sum += nums[end];
            
            if (end - start + 1 == k) {
                max = Math.max(max, sum);
                sum -= nums[start];
                start++;
            }
        }

       
        return (max/k);
    }
}
