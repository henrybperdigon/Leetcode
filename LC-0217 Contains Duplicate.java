//Brute Force solution
// Time Complexity: O(n*n)
// Space Complexity: O(1)

// Time Limit Exceeded
class Solution {
    public boolean containsDuplicate(int[] nums) {
    
      for (int i = 0; i < nums.length; ++i) {
        for (int j = 0; j < i; ++j) {
            if (nums[j] == nums[i]) return true;  
        }
      }
    return false;
    }
}

//Optimal 
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {      
    HashSet<Integer> hs = new HashSet<>();
    
    for(int i=0; i<nums.length; i++){
        if (!hs.contains(nums[i])) {
            hs.add(nums[i]);
        } else {
            return true;
        }
    }
    return false;
    }
}
