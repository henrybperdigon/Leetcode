/**
Solution 1
*/
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        char[] arr = sb.toString().toCharArray();

        int i = 0;
        int j = arr.length-1;

        while(i<j) {
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        
        return true;
    }
}

/**
Solution 2
*/
class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() -1;

        while (i<j) {
            
            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            
            i++;
            j--;
        }

        return true;
        
    }
}
