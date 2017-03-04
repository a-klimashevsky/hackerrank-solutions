package choosing.white.balls;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w28/challenges/choosing-white-balls
 */
class Solution {

    private final Map<String, Double> stored;

    public Solution(int n) {
        stored = new HashMap<>(n*n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String balls = in.next();
        in.close();
        Solution solution = new Solution(n);
        double prob = solution.giveProbability(balls, k);
        System.out.println(prob);
    }

    private static double match(char c) {
        return c == 'W' ? 1 : 0;
    }

    double giveProbability(String balls, int k) {
        if(stored.containsKey(balls)) {
            return stored.get(balls);
        }
        int n = balls.length();
        double prob = 0;
        if (k == 0) {
            prob = 0;
        } else {
            for (int i = 0; i < n / 2; i++) {
                double matchL = match(balls.charAt(i));
                double matchR = match(balls.charAt(n - i - 1));
                double probL = giveProbability(sub(balls,i), k - 1) ;
                double probR = giveProbability(sub(balls, n - i - 1), k - 1);
                prob += 2 *  Math.max(matchL + probL, probR + matchR) /n;
            }
            if (n % 2 == 1) {
                int i = (n -1)/ 2 ;
                double matchM = match(balls.charAt(i));
                double probM = giveProbability(sub(balls, i), k - 1);
                prob += (matchM + probM)/n;
            }
        }
        stored.put(balls, prob);
        return prob;
    }
    private String sub(String origin, int i) {
        StringBuilder builder = new StringBuilder(origin);
        return builder.deleteCharAt(i).toString();
    }
}
