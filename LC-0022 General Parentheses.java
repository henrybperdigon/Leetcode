class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }

    public void helper(List<String> result, String currentStr, int open, int close, int n) {
        if (open == n && close == n) {
            result.add(currentStr);
        }

        if (open < n) {
            helper(result, currentStr + "(", open + 1, close, n);
        }

        if (close < open) {
            helper(result, currentStr + ")", open, close + 1, n);
        }
    }
}
