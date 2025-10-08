package array;

public class ComputeAlternatingSum {

    public int alternatingSum(int[] nums) {

        int n = nums.length;
        int total = 0;

        for (int i = 0; i<n; i++) {
            if (i % 2 == 0) {
                total = total + nums[i];
            }
            else {
                total = total - nums[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 9};
        ComputeAlternatingSum obj = new ComputeAlternatingSum();
        System.out.println(obj.alternatingSum(nums));
    }
}
