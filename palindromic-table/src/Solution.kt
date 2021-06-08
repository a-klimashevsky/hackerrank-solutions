import java.io.PrintWriter
import java.util.*

typealias Digits = Array<Int>

fun main(args: Array<String>) {
    Scanner(System.`in`).use { _in ->
        PrintWriter(System.out).use { out ->
            solve(_in, out)
        }
    }
}

fun solve(_in: Scanner, out: PrintWriter) {
    val n = _in.nextInt()
    val m = _in.nextInt()

    val table = Array(n, { mutableListOf<Digits>() })

    for (i in 0 until n) {
        for (j in 0 until m) {
            val digit = _in.nextInt()
            val upper = if (i > 0) table[i - 1][j] else empty()
            val left = if (j > 0) table[i][j - 1] else empty()
            val inner = if (i > 0 && j > 0) table[i - 1][j - 1] else empty()
            val result = upper + left - inner
            result[digit]++
            table[i].add(result)
        }
    }

    val (x1, y1, y2, x2) = find(table, 0, 0, m - 1, n - 1)

    out.println((y2 - x1 + 1).toLong() * (x2 - y1 + 1).toLong())
    out.println("$x1 $y1 $x2 $y2")
}

fun empty() = Digits(10, { 0 })

operator fun Digits.plus(digitsB: Digits) = Digits(this.size, { i -> this[i] + digitsB[i] })

operator fun Digits.minus(other: Digits) = Digits(this.size, { i -> this[i] - other[i] })

fun Digits.isPalindrome(): Boolean {
    val oddSum =
        this.foldIndexed(0, { index, acc, value -> if (value % 2 == 0 && index != 0 && value > 0) acc + 1 else acc })
    val evenSum = this.fold(0, { acc, it -> if (it % 2 == 1) acc + 1 else acc })
    val zeroSum = this[0]
    return evenSum < 2 && (zeroSum < 2 || oddSum > 0)
}

fun find(table: Array<MutableList<Digits>>, left: Int, top: Int, right: Int, bottom: Int): Array<Int> {
    val cached = findInCache(left, top, right, bottom)
    if (cached != null) {
        return cached
    }
    val a = table[bottom][right]
    val b = if (top > 0) table[top - 1][right] else empty()
    val c = if (left > 0) table[bottom][left - 1] else empty()
    val d = if (top > 0 && left > 0) table[top - 1][left - 1] else empty()
    val candidate = a - b - c + d
    return if (candidate.isPalindrome()) {
        arrayOf(left, top, right, bottom).also { putInCache(left, top, right, bottom, it) }
    } else {
        val subCandidates = mutableListOf<Array<Int>>()
        if (left < right) {
            subCandidates.add(find(table, left + 1, top, right, bottom))
            subCandidates.add(find(table, left, top, right - 1, bottom))
            if (top < bottom) {
                subCandidates.add(find(table, left, top + 1, right, bottom))
                subCandidates.add(find(table, left, top, right, bottom - 1))
            }
        } else {
            if (top < bottom) {
                subCandidates.add(find(table, left, top + 1, right, bottom))
                subCandidates.add(find(table, left, top, right, bottom - 1))
            }
        }
        max(subCandidates)
    }
}

fun max(candidates: List<Array<Int>>) =
    candidates.reduce { best, current -> if (square(current) > square(best)) current else best }


fun square(t: Array<Int>): Long {
    return (t[2] - t[0] + 1).toLong() * (t[3] - t[1] + 1).toLong()
}

data class Info(val left: Int, val top: Int, val right: Int, val bottom: Int)

val cache = HashMap<Info, Array<Int>>()

fun findInCache(left: Int, top: Int, right: Int, bottom: Int) = cache[Info(left, top, right, bottom)]

fun putInCache(left: Int, top: Int, right: Int, bottom: Int, value: Array<Int>) {
    cache.put(Info(left, top, right, bottom), value)
}
