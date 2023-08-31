class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;

        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1') {
                   numIslands++;
                   visitIslands(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private void visitIslands(char[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j>=grid[i].length || grid[i][j] == '0') return;

        grid[i][j] = '0';
        visitIslands(grid, i-1, j); //top
        visitIslands(grid, i+1, j); //bottm
        visitIslands(grid, i, j-1); //left
        visitIslands(grid, i, j+1); //right
    }
}
