class Solution {
    public boolean isPowerOfThree(int n) {
      if (n < 1) return false;
        
    return (n == 1) || isPowerOfThree(n/3);
    }
}
