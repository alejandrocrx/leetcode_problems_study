public class UniquePaths {
    public static void main(String[] args) {
        /*
         * There is a robot on an m x n grid. The robot is initially located at the
         * top-left corner (i.e., grid[0][0]). The robot tries to move to the
         * bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move
         * either down or right at any point in time.
         * 
         * Given the two integers m and n, return the number of possible unique paths
         * that the robot can take to reach the bottom-right corner.
         * 
         * The test cases are generated so that the answer will be less than or equal to
         * 2 * 109.
         * 
         * Input: m = 3, n = 7 Output: 28
         */

        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int m, int n) {
        // 2d array for storing possible paths
        int[][] dp = new int[m][n];
        // first cell in array is 1
        dp[0][0] = 1;
        // initialize first row to 1 because its base case
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        // initialize first column to 1 because its base case
        for (int j = 1; j < n; j++) {
            dp[0][j] = 1;
        }

        // start at cell i=1 j=1 and get the sum of top cell + left cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // return the last cell
        return dp[m - 1][n - 1];
    }
}