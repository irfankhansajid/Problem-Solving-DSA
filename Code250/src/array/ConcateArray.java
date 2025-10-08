package array;

import java.util.Arrays;

public class ConcateArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i=0; i<2*n; i++) {
//            ans[i] = nums[i];
//            ans[n+i] =  nums[i%n];
            ans[i] =  nums[i%n]; // Optimize by module for large number of numbers

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

}
