package twin.arrays

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()
    val ar1 = IntArray(n)
    for (ar1_i in 0..n - 1) {
        ar1[ar1_i] = `in`.nextInt()
    }
    val ar2 = IntArray(n)
    for (ar2_i in 0..n - 1) {
        ar2[ar2_i] = `in`.nextInt()
    }
    val result = twinArrays(ar1, ar2)
    System.out.println(result)
}

fun twinArrays(ar1: IntArray, ar2: IntArray): Int {
    val list1 = ar1.toSorted()
    val list2 = ar2.toSorted()
    if (list1[0].second != list2[0].second) {
        return list1[0].first + list2[0].first
    } else {
        val a = list1[1].first + list2[0].first
        val b = list1[0].first + list2[1].first
        return Math.min(a, b)
    }

}

fun IntArray.toSorted(): List<Pair<Int, Int>> =
    this.mapIndexed { i, v -> Pair(v, i) }.sortedWith(object : Comparator<Pair<Int, Int>> {
        override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
            return o1.first.compareTo(o2.first)
        }
    })
