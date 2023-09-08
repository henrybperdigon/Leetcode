class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] wd = new int[temperatures.length];

        for (int i=temperatures.length-1; i>=0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
              wd[i] = stack.peek() - i;
            }
            
            stack.push(i);
        }
        return wd;       
    }
}
