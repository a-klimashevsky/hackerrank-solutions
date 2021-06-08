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
    val m = _in.nextInt()
    val q = _in.nextInt()

    val g = Graph(n)

    for (i in 1..m) {
        val u = _in.nextInt()
        val v = _in.nextInt()
        g.addEdge(u, v)
    }

    for (i in 1..q) {
        val u = _in.nextInt()
        val v = _in.nextInt()
        val w = _in.nextInt()
        val exist = g.exist(u, v, w)
        out.println(if (exist) "YES" else "NO")
    }
}

class Graph(val n: Int) {

    private val edges = Array(n + 1, { mutableListOf<Int>() })

    fun addEdge(u: Int, v: Int) {
        edges[u].add(v)
        edges[v].add(u)
    }

    fun exist(s: Int, t: Int, w: Int): Boolean {
        val marked = Array(n + 1, { false })
        val adj = Array(n + 1, { i -> edges[i].iterator() })
        var visited = false
        marked[s] = true

        val stack = Stack<Int>()
        stack.push(s)
        while (!stack.isEmpty()) {
            val v = stack.peek()
            if (adj[v].hasNext()) {
                if (v == w) {
                    visited = true
                }
                if (v == t && visited) {
                    return true
                }
                val u = adj[v].next()
                if (!marked[u]) {
                    stack.push(u)
                    marked[u] = true
                }
            } else {
                stack.pop()
                marked[v] = false
                if (v == w) {
                    visited = false
                }
                adj[v] = edges[v].iterator()
            }

        }

        return false
    }

}
