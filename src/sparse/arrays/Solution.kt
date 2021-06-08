package sparse.arrays

import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val _in = Scanner(System.`in`)
    val n = _in.nextInt()
    _in.nextLine()
    val map: HashMap<String, Int> = HashMap()
    for (i in 0..n - 1) {
        val s = _in.nextLine()
        map.put(s, (map[s] ?: 0) + 1)
    }
    val q = _in.nextInt()
    _in.nextLine()
    for (i in 0..q - 1) {
        val s = _in.nextLine()
        println(map[s] ?: 0)
    }
    _in.close()
}
