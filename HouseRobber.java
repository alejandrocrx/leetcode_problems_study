public class HouseRobber {
    public static void main(String[] args) {
        /*
         * You are a professional robber planning to rob houses along a street. Each
         * house has a certain amount of money stashed, the only constraint stopping you
         * from robbing each of them is that adjacent houses have security systems
         * connected and it will automatically contact the police if two adjacent houses
         * were broken into on the same night.
         * 
         * Given an integer array nums representing the amount of money of each house,
         * return the maximum amount of money you can rob tonight without alerting the
         * police.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3,1] Output: 4 Explanation: Rob house 1 (money = 1) and
         * then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
         */
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int p3 = 0;
        int p2 = nums[nums.length - 1];
        int p1 = nums[nums.length - 2];
        int max = Math.max(p2, p1);

        for (int i = nums.length - 3; i >= 0; i--) {
            int current = nums[i] + Math.max(p2, p3);
            max = Math.max(current, max);
            p3 = p2;
            p2 = p1;
            p1 = current;
        }

        return max;
    }
}
