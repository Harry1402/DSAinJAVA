public class setMisMatch {

    public static int[] findErrorNums(int[] nums) {
        int[] newarray = new int[2];
        boolean[] dummyarray = new boolean[nums.length + 1];

        for (int num : nums) {
            if (dummyarray[num]) {
                newarray[0] = num;   // duplicate
            } else {
                dummyarray[num] = true;
            }
        }

        for (int i = 1; i < dummyarray.length; i++) {
            if (!dummyarray[i]) {
                newarray[1] = i;    // missing
                break;
            }
        }

        return newarray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        int[] result = findErrorNums(nums);

        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
