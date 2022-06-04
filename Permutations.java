import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        /*
         * Given an array nums of distinct integers, return all the possible
         * permutations. You can return the answer in any order.
         * 
         * Input: nums = [1,2,3] Output:
         * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
         */
        int[] arr = { 1, 2, 3 };
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, nums, new ArrayList<>());
        return list;
    }

    public static void dfs(List<List<Integer>> list, int[] nums, List<Integer> tempList) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) {
                continue;
            }
            tempList.add(nums[i]);
            dfs(list, nums, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
