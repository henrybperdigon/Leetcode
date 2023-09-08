class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
           if (str.equalsIgnoreCase("+")) {
               stack.push(stack.pop() + stack.pop());
           } else if (str.equalsIgnoreCase("-")) {
               int a = stack.pop();
               int b = stack.pop();
               stack.push(b - a);
           } else if (str.equalsIgnoreCase("*")) {
               stack.push(stack.pop() * stack.pop());
           } else if (str.equalsIgnoreCase("/")) {
               int a = stack.pop();
               int b = stack.pop();
               stack.push(b / a);
           } else {
               stack.push(Integer.parseInt(str));
           }
        }
        return stack.peek();
    }
}
