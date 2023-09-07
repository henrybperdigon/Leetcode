class Solution {
    public int diagonalSum(int[][] mat) {

        int ans = 0;
        int n = mat.length;
        for(int i=0; i<n; i++) {
            //primary diagonal
            ans += mat[i][i];
            //secondart diagonal
            ans += mat[n-1-i][i];
        }

        if(n%2 != 0) {
            ans -= mat[n/2][n/2];
        }  
        
        return ans;
    }
}

/**
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Solution
1. iterate over array length
2. declare int sum to keep track of sum
3. add mat[i][i] for primary diagonal to the sum
4. add mat[n-1-i][i] for reverse diagonal
5. if matrix is odd-numbered (e.g. 3x3), subtract mat[n/2][n/2] from the sum
*/
