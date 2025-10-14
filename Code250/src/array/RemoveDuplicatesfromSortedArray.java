package array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];

            }
        }
        return k+1;
    }
}
