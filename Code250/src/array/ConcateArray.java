package array;

import java.util.Arrays;

public class ConcateArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i=0; i<n; i++) {
            ans[i] = nums[i];
                ans[n+i] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100000000};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

}
