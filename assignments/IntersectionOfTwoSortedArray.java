import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {

    static class Solution {
        ArrayList<Integer> intersection(int[] a, int[] b) {

            ArrayList<Integer> a1 = new ArrayList<>();
            int i = 0;
            int j = 0;

            while (i < a.length && j < b.length) {

                if (a[i] == b[j]) {
                    a1.add(a[i]);
                    i++;
                    j++;
                } 
                else if (a[i] < b[j]) {
                    i++;
                } 
                else { // a[i] > b[j]
                    j++;
                }
            }

            return a1;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5};
        int[] b = {2, 2, 4, 6};

        Solution sol = new Solution();
        ArrayList<Integer> result = sol.intersection(a, b);

        System.out.println(result);  // Output: [2, 2, 4]
    }
}
