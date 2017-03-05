package hackerland.radio.transmitters;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/hackerland-radio-transmitters
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        Solution solution = new Solution();

        int out = solution.calculateTransmittersCount(k, x);

        System.out.println(out);
    }

    int calculateTransmittersCount(int k, int... map) {

        Arrays.sort(map);

        int count = 0;

        int lastPos = Integer.MIN_VALUE;
        int i = 0;
        while(i < map.length) {
            int x = map[i];
            if(Math.abs(x - lastPos) > k) {
                int j = i;
                while (j < map.length && Math.abs(x - map[j]) <= k) {
                    j++;
                }
                if(i == j) {
                    count++;
                    i++;
                } else {
                    lastPos = map[j-1];
                    count++;
                    i = j;
                }
            }else {
                i++;
            }
        }


        return count;
    }
}
