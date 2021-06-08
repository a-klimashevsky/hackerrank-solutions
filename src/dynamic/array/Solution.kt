package dynamic.array

import java.util.*

var lastAnswer = 0
var N = 0

fun main(args: Array<String>) {
    val _in = Scanner(System.`in`)
    N = _in.nextInt()
    val q = _in.nextInt()
    val seqList = Array<MutableList<Int>>(N, { mutableListOf() })
    _in.nextLine()
    for (i in 0..q - 1) {
        val queue = _in.nextLine()
        val (command, x, y) = queue.split(" ")
        when (command) {
            "1" -> append(seqList, x.toInt(), y.toInt())
            "2" -> updateLastAnswer(seqList, x.toInt(), y.toInt())
        }
    }

    _in.close()
}

fun updateLastAnswer(seqList: Array<MutableList<Int>>, x: Int, y: Int) {
    val seq = seqList[index(x)]
    lastAnswer = seq[y % seq.size]
    System.out.println(lastAnswer)
}

fun append(seqList: Array<MutableList<Int>>, x: Int, y: Int) {
    seqList[index(x)].add(y)
}

fun index(x: Int) = (x xor lastAnswer) % N
