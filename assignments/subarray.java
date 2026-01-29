import java.util.*;

public class subarray {

    public static void main(String[] args) {

        // Example input
        int[] nums = {1, 2, 3};
        int k = 3;

        Solution sol = new Solution();
        int result = sol.subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}

class Solution {

    public int subarraySum(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int result = 0;

            for (int j = i; j < nums.length; j++) {

                result += nums[j];

                if (result == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
