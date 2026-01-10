import java.util.Arrays;

public class MoveZero {

    static class Solution {
        public void moveZeroes(int[] nums) {
            int temp = 0;
            int i = -1;
            int j = 0;

            while (j < nums.length) {
                if (nums[j] != 0) {
                    temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                    i++;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution sol = new Solution();
        sol.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
