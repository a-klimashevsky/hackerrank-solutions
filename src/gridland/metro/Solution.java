package gridland.metro;

import com.sun.applet2.AppletParameters;

import java.util.*;
import java.util.Scanner;

/**
 * Created by alexk on 3/5/17.
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        int k = scanner.nextInt();
        long[][] tracks = new long[k][];
        for (int i = 0; i < k; i++) {
            long r = scanner.nextInt();
            long c1 = scanner.nextInt();
            long c2 = scanner.nextInt();
            tracks[i] = new long[]{r, c1, c2};
        }
        scanner.close();
        long result = solution.getFreeSpaceCount(n, m, tracks);
        System.out.println(result);
    }

    long getFreeSpaceCount(long n, long m, long[][] tracks) {

        HashMap<Long, List<Track>> trackMap = new HashMap<>();

        for (long[] track : tracks) {
            long r = track[0];
            long c1 = track[1];
            long c2 = track[2];
            Track t = new Track(c1, c2);
            if (!trackMap.containsKey(r)) {
                trackMap.put(r, new ArrayList<Track>());
            }
            trackMap.get(r).add(t);
        }

        return getFreeSpaceCount(n, m, trackMap);
    }

    long getFreeSpaceCount(long n, long m, HashMap<Long, List<Track>> trackMap) {
        long out = m * (n - trackMap.size());

        for(List<Track> tracks: trackMap.values()) {
            List<Track> t = mergeIntervals(tracks);
            long r = m;
            for(Track track: t) {
                r -= (track.end - track.start+1);
            }
            out += r;
        }

        return out;
    }

    List<Track> mergeIntervals(List<Track> arr) {
        int n = arr.size();
        // Sort Intervals in decreasing order of
        // start time
        Collections.sort(arr, new Comparator<Track>() {
            @Override
            public int compare(Track a, Track b) {
                return - (int) (a.start - b.start);
            }
        });

        int index = 0; // Stores index of last element
        // in output array (modified arr[])

        // Traverse all input Intervals
        for (int i = 0; i < n; i++) {
            // If this is not first Interval and overlaps
            // with the previous one
            if (index != 0 && arr.get(index - 1).start <= arr.get(i).end) {
                while (index != 0 && arr.get(index - 1).start <= arr.get(i).end) {
                    // Merge previous and current Intervals
                    arr.get(index - 1).end = Math.max(arr.get(index - 1).end, arr.get(i).end);
                    arr.get(index - 1).start = Math.min(arr.get(index - 1).start, arr.get(i).start);
                    index--;
                }
            } else // Doesn't overlap with previous, add to
                // solution
                arr.set(index, arr.get(i));

            index++;
        }

        return arr.subList(0, index);
    }

    boolean mycomp(Track a, Track b) {
        return a.start > b.start;
    }

     static final class Track {
        long start;
        long end;

        Track(long start, long end) {
            this.start = start;
            this.end = end;
        }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;

             Track track = (Track) o;

             if (start != track.start) return false;
             return end == track.end;

         }

         @Override
         public int hashCode() {
             int result = (int) (start ^ (start >>> 32));
             result = 31 * result + (int) (end ^ (end >>> 32));
             return result;
         }

         @Override
         public String toString() {
             return "Track{" +
                     "start=" + start +
                     ", end=" + end +
                     '}';
         }
     }
}
