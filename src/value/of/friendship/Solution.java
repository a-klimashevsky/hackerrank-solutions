package value.of.friendship;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            HashSet[] groups = new HashSet[n];
            for (int i = 0; i < n; i++) {
                groups[i] = new HashSet<Integer>();
                groups[i].add(i);
            }
            int m = in.nextInt();
            int sum = 0;
            long total = 0;
            int skip = 0;
            for (int a1 = 0; a1 < m; a1++) {
                int x = in.nextInt();
                int y = in.nextInt();
                HashSet<Integer> gX = groups[x - 1];
                HashSet<Integer> gY = groups[y - 1];
                if (gX == gY) {
                    skip++;
                } else {
                    HashSet<Integer> u = unite(gX, gY);
                    for (int i : u) {
                        groups[i] = u;
                    }
                }

            }

            Set<HashSet<Integer>> dist = new HashSet<>();
            for (HashSet<Integer> g : groups) {
                dist.add(g);
            }
            List<HashSet<Integer>> list = new ArrayList<>(dist);
            Collections.sort(list, new Comparator<HashSet<Integer>>() {
                @Override
                public int compare(HashSet<Integer> o1, HashSet<Integer> o2) {
                    return -Integer.compare(sum(o1.size()), sum(o2.size()));
                }
            });

            long last = 0;
            for (HashSet<Integer> g : list) {
                total += superSum(g.size()) + last * (g.size() - 1);
                last += sum(g.size());
            }

            total += last * skip;
            System.out.println(total);
        }
        in.close();
    }

    private static HashSet<Integer> unite(HashSet<Integer> gX, HashSet<Integer> gY) {
        HashSet<Integer> u = new HashSet<>(gX);
        u.addAll(gY);
        return u;
    }

    private static int sum(int n) {
        return n * (n - 1);
    }

    static long superSum(long n) {
        if(n %2 == 1){
            return oddSum(n/2);
        } else {
            return evenSum(n/2);
        }
    }

    private static long evenSum(long k) {
        return 2 * k *(4*k*k-1)/3;
    }

    private static long oddSum(long k) {
        return 8 * k * (k + 1) * (2*k + 1)/6;
    }
}
