package transform.to.palindrome

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionKtTest {

    @Test
    fun findRoot_012and2_2() {
        val x = findRoot(arrayOf(0, 1, 2), 2)
        assertEquals(2, x)
    }

    @Test
    fun findRoot_011and2_1() {
        val x = findRoot(arrayOf(0, 1, 1), 2)
        assertEquals(1, x)
    }

    @Test
    fun addTransformation_01x1y1_01() {
        val array = arrayOf(0, 1)
        addTransformation(array, 1, 1)
        assertArrayEquals(array, arrayOf(0, 1))
    }

    @Test
    fun addTransformation_012x1y2_011() {
        val array = arrayOf(0, 1, 2)
        addTransformation(array, 1, 2)
        assertArrayEquals(array, arrayOf(0, 1, 1))
    }

    @Test
    fun addTransformation_0123x1y2x3y2_0111() {
        val array = arrayOf(0, 1, 2, 3)
        addTransformation(array, 1, 2)
        addTransformation(array, 3, 2)
        assertArrayEquals(arrayOf(0, 1, 1, 1), array)
    }

    @Test
    fun applyTransformations___() {
        val word = arrayOf(1, 4, 5, 9, 3, 1)
        val symbols = arrayOf(0, 1, 2, 3, 3, 5, 6, 7, 8, 9) // 3 -> 4
        applyTransformations(word, symbols)
        assertArrayEquals(arrayOf(1, 3, 5, 9, 3, 1), word)
    }

}
