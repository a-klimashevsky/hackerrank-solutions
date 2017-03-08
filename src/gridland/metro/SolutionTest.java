package gridland.metro;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import gridland.metro.Solution.*;

/**
 * Created by alexk on 3/5/17.
 */
public class SolutionTest {
    @Test
    public void getFreeSpaceCount() throws Exception {
        Solution solution = new Solution();
        long count = solution.getFreeSpaceCount(4, 4, new long[][]{
                new long[]{2, 2, 3},
                new long[]{3, 1, 4},
                new long[]{4, 4, 4}
        });
        assertEquals(9, count);

        count = solution.getFreeSpaceCount(4, 5, new long[][]{
                new long[]{1, 1, 2},
                new long[]{1, 4, 4},
                new long[]{2, 1, 2},
                new long[]{2, 2, 3},
                new long[]{2, 4, 5},
                new long[]{4, 1, 2},
                new long[]{4, 4, 5}});

        assertEquals(8, count);
    }

    @Test
    public void mergeSingleTrack() throws Exception {
        Solution solution = new Solution();
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(1,2));
        List<Track> out = solution.mergeIntervals(tracks);
        assertArrayEquals(new Track[]{new Track(1,2)}, out.toArray(new Track[]{}));
    }

    @Test
    public void mergeNoOverlapingNoBorderTracks() throws Exception {
        Solution solution = new Solution();
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(1,2));
        tracks.add(new Track(4,5));
        List<Track> out = solution.mergeIntervals(tracks);
        assertArrayEquals(new Track[]{ new Track(4,5), new Track(1,2)}, out.toArray(new Track[]{}));
    }

}
