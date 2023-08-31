class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack();
        Stack<String> strStack = new Stack();
        int index = 0;
        String res = "";
      
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                String count = "";
                while (s.charAt(index) != '[') {
                    count += s.charAt(index);
                    index++;
                }
                numStack.push(Integer.parseInt(count));
            } else if (s.charAt(index) == '[') {
                strStack.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int count = numStack.pop();
                for (int i=0; i<count; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += s.charAt(index);
                index++;
            }
        }
        
        return res;
    }
}
