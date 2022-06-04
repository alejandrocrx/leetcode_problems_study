public class ClimbingStairs {
    public static void main(String[] args) {
        /*
         * You are climbing a staircase. It takes n steps to reach the top.
         * 
         * Each time you can either climb 1 or 2 steps. In how many distinct ways can
         * you climb to the top?
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top.
         * 1. 1 step + 1 step 2. 2 steps
         */
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {
        int[] memoization = new int[n + 1];

        memoization[0] = 1;
        memoization[1] = 1;

        for (int i = 2; i <= n; i++) {
            memoization[i] = memoization[i - 1] + memoization[i - 2];
        }

        return memoization[n];
    }
}
