package heaters;

import java.util.Arrays;

/**
 * Created by alexk on 4/18/21.
 */
public class Solution {

    public int findRadius(int[] houses, int[] heaters) {
        int maxRadius = Integer.MIN_VALUE;
        Arrays.sort(heaters);
        Arrays.sort(houses);
        for (int house : houses) {
            int heaterIndex = findNearestHeater(house, heaters, 0, heaters.length - 1);
            int radius = Math.abs(house - heaters[heaterIndex]);
            maxRadius = Math.max(maxRadius, radius);
        }
        return maxRadius;
    }

    private int findNearestHeater(int house, int[] heaters, int start, int end) {
        if (house <= heaters[start]) {
            return start;
        }
        if (house >= heaters[end]) {
            return end;
        }
        if (start < end - 1) {
            int m = (end + start) / 2;
            if (house < heaters[m]) {
                return findNearestHeater(house, heaters, start, m);
            } else if (house > heaters[m]) {
                return findNearestHeater(house, heaters, m, end);
            } else {
                return m;
            }
        }
        int d1 = house - heaters[start];
        int d2 = heaters[end] - house;
        if (d1 < d2) {
            return start;
        }
        return end;
    }
}
