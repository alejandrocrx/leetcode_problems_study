public class MaximumProductSubarray {
    public static void main(String[] args) {
        /*
         * Given an integer array nums, find a contiguous non-empty subarray within the
         * array that has the largest product, and return the product.
         * 
         * The test cases are generated so that the answer will fit in a 32-bit integer.
         * 
         * A subarray is a contiguous subsequence of the array.
         * 
         * Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product
         * 6.
         */
        int[] array = { 2, 3, -2, 4 };
        System.out.println(maxProduct(array));

    }

    public static int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int current = 1;
        for (int i = 0; i < nums.length; i++) {
            current = current * nums[i];
            if (current > max) {
                max = current;
            }

            if (current == 0) {
                current = 1;
            }
        }

        current = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            current = current * nums[i];
            if (current > max) {
                max = current;
            }

            if (current == 0) {
                current = 1;
            }
        }

        return max;
    }
}
