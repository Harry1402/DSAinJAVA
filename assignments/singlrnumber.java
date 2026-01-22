import java.util.HashSet;
public class singlrnumber {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return set.iterator().next();

    }

     public static void main(String[] args) {
        int[] nums = {2, 2, 1, 4, 4};
        System.out.println(singleNumber(nums)); // Output: 1
    }
}
