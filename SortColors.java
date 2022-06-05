public class SortColors {
    public static void main(String[] args) {
        /*
         * Given an array nums with n objects colored red, white, or blue, sort them
         * in-place so that objects of the same color are adjacent, with the colors in
         * the order red, white, and blue.
         * 
         * We will use the integers 0, 1, and 2 to represent the color red, white, and
         * blue, respectively.
         * 
         * You must solve this problem without using the library's sort function.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
         */
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        int index = 0;

        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }

            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }

            index++;
        }
    }
}