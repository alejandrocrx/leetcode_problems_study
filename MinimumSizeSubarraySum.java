public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        /*
         * Given an array of positive integers nums and a positive integer target,
         * return the minimal length of a contiguous subarray [numsl, numsl+1, ...,
         * numsr-1, numsr] of which the sum is greater than or equal to target. If there
         * is no such subarray, return 0 instead.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: target = 7, nums = [2,3,1,2,4,3] Output: 2 Explanation: The subarray
         * [4,3] has the minimal length under the problem constraint.
         */

    }

    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MIN_VALUE;

        while (end < nums.length) {
            sum = sum + nums[end++];

            while (sum > target) {
                min = Math.min(min, end - start);
                sum = sum - nums[start++];
            }
        }

        return min;
    }
}