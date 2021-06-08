package array.left.rotation

import java.util.*

fun main(args: Array<String>) {
    val _in = Scanner(System.`in`)
    val n = _in.nextInt()
    val k = _in.nextInt()
    val array = Array(n, { _in.nextInt() })

    (0..n - 1).forEach { print(array[(it + k) % n]).also { print(" ") } }

    _in.close()
}
