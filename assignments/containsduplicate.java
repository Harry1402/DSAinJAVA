import java.util.*;
public class containsduplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
    }


     public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean ans = containsDuplicate(nums);
         System.out.println(ans); // true
    }
}
