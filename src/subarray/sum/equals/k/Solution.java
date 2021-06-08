package subarray.sum.equals.k;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexk on 2/18/21.
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hm.containsKey(sum - k)) count += hm.get(sum - k);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
