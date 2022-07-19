public class RunningSum {

    /*
     * Given an array nums. We define a running sum of an array as runningSum[i] =
     * sum(nums[0]…nums[i]).
     * 
     * Return the running sum of nums.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
