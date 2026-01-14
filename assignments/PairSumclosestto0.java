import java.util.Arrays;

public class PairSumclosestto0 {

    static class Solution {
        public static int closestToZero(int arr[], int n) {

            int distance = Integer.MAX_VALUE;
            int sum = 0;
            int start = 0;
            int end = arr.length - 1;

            Arrays.sort(arr);

            while (start < end) {
                int currentsum = arr[start] + arr[end];

                if (distance > Math.abs(currentsum)) {
                    sum = currentsum;
                    distance = Math.abs(currentsum);
                } else if (distance == Math.abs(currentsum)) {
                    sum = Math.max(sum, currentsum);
                }

                if (currentsum < 0) {
                    start++;
                } else if (currentsum > 0) {
                    end--;
                } else {
                    return 0;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {

        int[] arr = {29, -6, -32, -12, 13};
        int n = arr.length;

        int ans = Solution.closestToZero(arr, n);
        System.out.println("Closest sum to zero: " + ans);
    }
}
