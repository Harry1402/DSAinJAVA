import java.util.*;

public class unionofarray {
    public static ArrayList<Integer> unionSorted(int[] a, int[] b) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {

            // skip duplicates in a
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }

            // skip duplicates in b
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                ans.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                ans.add(b[j]);
                j++;
            } else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }

        // remaining elements in a
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                ans.add(a[i]);
            }
            i++;
        }

        // remaining elements in b
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 5};
        int[] b = {2, 2, 3, 5, 6};

        ArrayList<Integer> result = unionSorted(a, b);
        System.out.println(result);
    }
}
