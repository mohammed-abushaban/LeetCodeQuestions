import java.util.Arrays;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    // Given an integer array nums, return true if any value appears at least twice
    // in the array, and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}