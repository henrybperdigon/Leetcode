/**
Approach 1: Using Extra Space
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] leftProducts = new int[len];
        int[] rightProducts = new int[len];
        int[] output = new int[len];

        leftProducts[0] = 1;
        rightProducts[len-1] = 1;

        for (int i=1; i<len; i++) {
            leftProducts[i] = nums[i-1] * leftProducts[i-1];
        }

        for (int j=len-2; j>=0; j--) {
            rightProducts[j] = nums[j+1] * rightProducts[j+1];
        }

        for (int i=0; i<len; i++) {
            output[i] = leftProducts[i] * rightProducts[i];
        }

        return output;
        
    }
}

/**
Approach 2: Optimized
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] output = new int[len];

        output[0] = 1;

        for (int i=1; i<len; i++) {
            output[i] = nums[i-1] * output[i-1];
        }

        int R = 1;
        for (int i=len-1; i>=0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
        
    }
}
