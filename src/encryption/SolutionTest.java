package encryption;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexk on 1/8/17.
 */
public class SolutionTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void encrypt() throws Exception {
        Solution solution = new Solution();
        String out = solution.encrypt("ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots");
        assertEquals("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau ", out);
        out = solution.encrypt("chillout");
        assertEquals("clu hlt io ", out);
    }

}