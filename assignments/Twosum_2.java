import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}

public class Twosum_2 {
     public static void main(String[] args) {

        int[] nums = {3, 3};
        int target = 6;

        Solution sol = new Solution();
        int[] ans = sol.twoSum(nums, target);

        System.out.println(Arrays.toString(ans));  // Example output: [1, 0]
    }
    
}
