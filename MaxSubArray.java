public class MaxSubArray {
    // Given an integer array nums, find the contiguous subarray (containing at
    // least one number) which has the largest sum and return its sum.
    // A subarray is a contiguous part of an array.
    public static int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int x = 0;
        for (int num : nums) {
            x += num;
            if (x > result)
                result = x;
            if (x < 0)
                x = 0;
        }
        return result;
    }
}
