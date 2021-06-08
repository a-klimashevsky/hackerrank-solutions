package product.of.array.except.self;

/**
 * Created by alexk on 2/22/21.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] front = new int[n];
        int[] back = new int[n];
        int start = 1;
        int end = 1;
        for (int i = 0; i < n; i++) {
            start *= nums[i];
            end *= nums[n - i - 1];
            front[i] = start;
            back[n - i - 1] = end;
        }

        int[] result = new int[n];

        result[0] = back[1];
        result[n - 1] = front[n - 2];

        for (int i = 1; i < n - 1; i++) {
            result[i] = front[i - 1] * back[i + 1];
        }
        return result;
    }
}
