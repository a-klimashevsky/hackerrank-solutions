package poles;

import java.util.*;

/**
 * https://www.hackerrank.com/contests/w30/challenges/poles
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Pole> list = new ArrayList<>(n);
        for (int a0 = 0; a0 < n; a0++) {
            int x_i = in.nextInt();
            int w_i = in.nextInt();
            list.add(new Pole(x_i, w_i));
        }
        in.close();
        long out = new Solution().cost(k, list);
        System.out.println(out);
    }

    long cost(int k, List<Pole> poles) {
        Collections.sort(poles, new Comparator<Pole>() {
            @Override
            public int compare(Pole o1, Pole o2) {
                return Integer.compare(o1.alt, o2.alt);
            }
        });
        return _cost(k, poles, -1);
    }

    private long _cost(int k, List<Pole> poles, int prevAlt) {
        if (poles.size() == 0) return 0;
        Pole pole = poles.get(0);
        if (prevAlt >= 0) {
            long sumA = (pole.alt - prevAlt) * pole.weight + _cost(k, poles.subList(1, poles.size()), prevAlt);
            if (k > 0) {
                long sumB = _cost(k - 1, poles.subList(1, poles.size()), pole.alt);
                return Math.min(sumA, sumB);
            } else {
                return sumA;
            }
        } else {
            return _cost(k - 1, poles.subList(1, poles.size()), pole.alt);
        }
    }

    static class Pole {
        final int alt;
        final int weight;

        Pole(int alt, int weight) {
            this.alt = alt;
            this.weight = weight;
        }
    }
}
