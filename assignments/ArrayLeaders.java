import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    static class Solution {
        static ArrayList<Integer> leaders(int arr[]) {

            ArrayList<Integer> a = new ArrayList<>();
            int currentLeader = 0;
            int j = arr.length - 1;

            while (j < arr.length && j >= 0) {
                if (arr[j] >= currentLeader) {  // ✅ >= is important
                    currentLeader = arr[j];
                    a.add(arr[j]);
                }
                j--;
            }

            Collections.reverse(a); // ✅ fix order
            return a;
        }
    }

    public static void main(String[] args) {
        int[] arr = {61, 61, 17};

        ArrayList<Integer> result = Solution.leaders(arr);

        // printing like GFG output
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
