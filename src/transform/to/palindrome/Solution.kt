package transform.to.palindrome

import java.util.*


fun main(args: Array<String>) {
    val _in = Scanner(System.`in`)
    val n = _in.nextInt()
    val k = _in.nextInt()
    val m = _in.nextInt()

    val symbols = Array(n + 1, { it -> it })

    for (i in 1..k) {
        val x = _in.nextInt()
        val y = _in.nextInt()
        addTransformation(symbols, x, y)
    }

    val word = Array(m, { 0 })

    for (i in 0 until m) {
        word[i] = _in.nextInt()
    }

    applyTransformations(word, symbols)

    val answer = findLongestPalindromicSubsequenceLength(word)

    print(answer)
}

fun findLongestPalindromicSubsequenceLength(word: Array<Int>): Int {
    val n = word.size
    val L = array2d(n, n, { 0 })

    for (i in 0 until n) {
        L[i][i] = 1
    }

    for (cl in 2..n) {
        for (i in 0 until (n - cl + 1)) {
            val j = i + cl - 1
            L[i][j] = when {
                word[i] == word[j] && cl == 2 -> 2
                word[i] == word[j] -> L[i + 1][j - 1] + 2
                else -> Math.max(L[i][j - 1], L[i + 1][j])
            }
        }
    }

    return L[0][n - 1]
}

fun applyTransformations(word: Array<Int>, symbols: Array<Int>) {
    for (i in 0 until word.size) {
        word[i] = findRoot(symbols, word[i])
    }
}

fun addTransformation(symbols: Array<Int>, x: Int, y: Int) { // x <y
    val xRoot = findRoot(symbols, x)
    val yRoot = findRoot(symbols, y)
    when {
        xRoot > yRoot -> symbols[x] = yRoot
        yRoot > xRoot -> symbols[y] = xRoot
    }
}

fun findRoot(symbols: Array<Int>, v: Int): Int {
    var c = v
    while (symbols[c] != c) {
        c = symbols[c]
    }
    return c
}


inline fun <reified INNER> array2d(
    sizeOuter: Int,
    sizeInner: Int,
    noinline innerInit: (Int) -> INNER
): Array<Array<INNER>> = Array(sizeOuter) { Array(sizeInner, innerInit) }

