import java.util.Arrays;

public class MinimumAbsoluteSumGoogle {
    public static void main(String[] args) {

        int[] x = { 78, 97, 23, 6, 51, 52, 28, 60, 33, 1, 100 };

        System.out.println(solve(x));
    }

    public static int solve(int[] A) {
        int n = A.length, ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for (int j = 1; j < n; j++) { // find the min cost for array [0, j] picking 1 element (median)
            dp1[j] = dp1[j - 1] + A[j] - A[j / 2];
        }
        for (int j = n - 2; j >= 0; j--) { // find the min cost for array [j, n) picking 1 element (median)
            dp2[j] = dp2[j + 1] + A[j + (n - j) / 2] - A[j];
        }
        for (int j = 1; j < n; j++) { // Select the min from all possible split point.
            ans = Math.min(ans, dp1[j - 1] + dp2[j]);
        }
        return ans;
    }
}