public class A26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // sample input
        Solution sol = new Solution();
        int result = sol.removeDuplicates(nums);
        System.out.println(result);
        

        
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i =1 ;i<nums.length ;i++)
       { 
        if(nums[i] != nums[i-1])
       { nums[k] =nums[i];
        k++;
        };
        
        }
        return k ;
        
    }
}