public class NumberOfIslands {
    public static void main(String[] args) {
        /*
         * Given an m x n 2D binary grid grid which represents a map of '1's (land) and
         * '0's (water), return the number of islands.
         * 
         * An island is surrounded by water and is formed by connecting adjacent lands
         * horizontally or vertically. You may assume all four edges of the grid are all
         * surrounded by water.
         * 
         * Input: grid = [ ["1","1","1","1","0"], ["1","1","0","1","0"],
         * ["1","1","0","0","0"], ["0","0","0","0","0"] ] Output: 1
         */
    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int numberOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    numberOfIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numberOfIslands;
    }

    public static void dfs(char[][] grid, int i, int j) {
        if (j < 0 || i < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
