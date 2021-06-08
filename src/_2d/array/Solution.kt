package _2d.array

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val arr = Array(6) { IntArray(6) }
    for (arr_i in 0..5) {
        for (arr_j in 0..5) {
            arr[arr_i][arr_j] = `in`.nextInt()
        }
    }

    var max = Int.MIN_VALUE

    for (i in 0..3) {
        for (j in 0..3) {
            max = Math.max(max, hourglass(arr, i, j))
        }
    }
    System.out.println(max)
}

fun hourglass(arr: Array<IntArray>, x: Int, y: Int): Int {
    return arr[y][x] + arr[y][x + 1] + arr[y][x + 2] +
            arr[y + 1][x + 1] +
            arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2]
}
