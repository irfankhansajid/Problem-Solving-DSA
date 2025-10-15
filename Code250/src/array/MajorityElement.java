package array;

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int n = nums.length;
        int k = n/2;
        Arrays.sort(nums);
        int result = nums[k];
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 4, 2};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
