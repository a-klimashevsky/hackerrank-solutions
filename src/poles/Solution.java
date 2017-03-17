package poles;

import java.util.*;

/**
 * https://www.hackerrank.com/contests/w30/challenges/poles
 */
class Solution {

    private long[] saved;

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
        saved = new long[poles.size()];
        Arrays.fill(saved, Integer.MAX_VALUE);
        Collections.sort(poles, new Comparator<Pole>() {
            @Override
            public int compare(Pole o1, Pole o2) {
                return -Integer.compare(o1.alt, o2.alt);
            }
        });
        return _cost(k, poles, 0);
    }

    private long _cost(int k, List<Pole> poles, int sI) {
        if (k > poles.size() || (k == 0 && poles.size() > 0)) {
            return Integer.MAX_VALUE;
        } else if (k == 0 && poles.size() == 0) {
            return 0;
        }

        for (int i = 0; i < poles.size(); i++) {
            long moveSum = calcMoveSum(poles, i);
            long subSum = _cost(k - 1, poles.subList(i + 1, poles.size()), sI + 1);
            saved[sI] = Math.min(saved[sI], moveSum + subSum);
        }
        return saved[sI];
    }

    private long calcMoveSum(List<Pole> poles, int end) {
        long s = 0;
        int alt = poles.get(end).alt;
        for (int i = 0; i < end; i++) {
            Pole pole = poles.get(i);
            s += (pole.alt - alt) * pole.weight;
        }
        return s;
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
