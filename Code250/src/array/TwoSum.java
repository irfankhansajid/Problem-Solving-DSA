package array;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n =  nums.length;


        for (int i = 0; i < n; i++) {
            for (int j = i+1; j<n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 26;
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
