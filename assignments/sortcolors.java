import java.util.Arrays;

public class sortcolors {

  
    public static void sortColors(int[] nums) {

        int i = 0;               
        int j = 0;               
        int k = nums.length - 1; 

        while (j <= k) {

            if (nums[j] == 1) {
                j++;
            }
            else if (nums[j] == 2) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
                
            }
            else { // nums[j] == 0
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before: " + Arrays.toString(nums));

        sortColors(nums);

        System.out.println("After : " + Arrays.toString(nums));
    }
}
