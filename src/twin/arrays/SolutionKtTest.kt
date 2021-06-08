package twin.arrays

import org.junit.Assert
import org.junit.Test

/**
 * Created by alexk on 6/12/17.
 */
class SolutionKtTest {
    @Test
    fun testTwinArrays() {
        val out = twinArrays(intArrayOf(5, 4, 3, 2, 1), intArrayOf(1, 2, 3, 4, 5))
        Assert.assertEquals(2, out)
    }

}
