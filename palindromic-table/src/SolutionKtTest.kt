import org.testng.Assert.assertFalse
import org.testng.annotations.Test

import java.util.*


class SolutionKtTest {
    @Test
    fun isPalindrome() {
        val d = empty()
        d[0] = 2
//        d[1] = 1
//        d[2] = 1
        assertFalse(d.isPalindrome())
    }

}
