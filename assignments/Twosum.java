import java.util.Arrays;

class Twosum1 {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int ourtarget = numbers[start] + numbers[end];

            if (ourtarget == target) {
                arr[0] = start;
                arr[0]++;

                arr[1] = end;
                arr[1]++;

                return arr;
            } else if (ourtarget > target) {
                end--;
            } else {
                start++;
            }
        }

        return arr;
    }
}

public class Twosum {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        Twosum1 sol = new Twosum1();
        int[] ans = sol.twoSum(numbers, target);

        System.out.println(Arrays.toString(ans));  // Output: [1, 2]
    }
}
