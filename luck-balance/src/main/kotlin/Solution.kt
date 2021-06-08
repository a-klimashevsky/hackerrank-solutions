import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    Scanner(System.`in`).use { _in ->
        PrintWriter(System.out).use { out ->
            solve(_in, out)
        }
    }
}

fun solve(_in: Scanner, out: PrintWriter) {
    val n = _in.nextInt()
    var k = _in.nextInt()
    val data = Array(n, { mutableMapOf(_in.nextInt() to _in.nextInt()) })
    while (k > 0) {
        var j = -1
        var min = Int.MAX_VALUE
        for (i in 1..data.size) {
            if (min > data[i - 1].first && data[i - 1].second == 1) {
                min = data[i - 1].first
                j = i - 1
            }
        }
        if (j > -1) {
            data[j].second = 0
        }
    }

}
