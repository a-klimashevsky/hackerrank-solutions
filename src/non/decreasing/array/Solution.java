package non.decreasing.array;

import java.util.Arrays;

/**
 * Created by alexk on 2/25/21.
 */
public class Solution {
    public boolean checkPossibility(int[] nums) {
        return check_max(Arrays.copyOf(nums, nums.length)) || check_min(Arrays.copyOf(nums, nums.length));
    }

    private boolean check_max(int[] nums) {
        int check = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] > nums[i]) {
                check++;
                nums[i - 1] = nums[i];
            }

        }
        return check < 2;
    }

    private boolean check_min(int[] nums) {
        int check = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                check++;
                nums[i + 1] = nums[i];
            }

        }
        return check < 2;
    }
}
