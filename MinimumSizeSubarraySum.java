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
        int min = Integer.MAX_VALUE;

        while (end < nums.length) {
            // or sum = sum + nums[end++];
            // it is the same as the code below
            sum = sum + nums[end];
            end++;
            while (sum >= target) {
                sum = sum - nums[start];
                min = Math.min(min, end - start);
                start++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}