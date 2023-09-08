/**
Approach 1: Using HashMap
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            map.put(num-1, map.getOrDefault(0,1));
        }

        for (int i=0; i<nums.length; i++) {
            if (!map.containsKey(i)) {
                result.add(i+1);
            }
        }

        return result;
        
    }
}

/**
Approach 1: Using In-Place Array Manipulation
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int idx = Math.abs(nums[i]) -1;
            
            if (nums[idx] < 0) continue;
            nums[idx] *= -1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) 
            list.add(i +1);
        }

        return list;
    }
}
