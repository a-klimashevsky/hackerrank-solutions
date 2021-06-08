package crush

import java.util.*

fun main(args: Array<String>) {
    val _in = Scanner(System.`in`)
    val n = _in.nextInt()
    val m = _in.nextInt()
    val array = Array(n, { 0L })
    for (i in 1..m) {
        val a = _in.nextInt()
        val b = _in.nextInt()
        val k = _in.nextLong()
        array[a - 1] += k
        if (b < n) {
            array[b] -= k
        }
    }
    var max = 0L
    val sum = array.reduce { x, i -> max = Math.max(max, x); x + i }
    println(Math.max(max, sum))
}
