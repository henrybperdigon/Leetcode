class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();

        for (int i=0; i<arr.length; i++) {
            if(arr[i] == '{')
                stack.push('}');
            else if (arr[i] == '[')
                stack.push(']');
            else if (arr[i] == '(')
                stack.push(')');
            else if (stack.isEmpty() || stack.pop() !=arr[i])
                return false;
        }

        return stack.isEmpty();
    }
}

/**

Use Stack<Character> data structure
1. Turn string into char array
2. Iterate over char array
3. if char is equal to any " { [ ( " push into stack closing character
4. if not, if stack is empty or stack.pop != arr[i]
5. if the stack is empty after last iteration, return true

*/
