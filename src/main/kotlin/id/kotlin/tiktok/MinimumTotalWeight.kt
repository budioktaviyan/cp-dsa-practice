package id.kotlin.tiktok

import java.util.PriorityQueue

fun findMinWeight(chocolates: List<Int>, day: Int): Int {
  val queue = PriorityQueue<Int>(compareByDescending { it })
  queue.addAll(chocolates)

  repeat(day) {
    val x = queue.poll()
    val newVal = (x.plus(1)).div(2)
    queue.add(newVal)
  }

  return queue.sum()
}

fun main() {
  val chocolates = listOf(30, 20, 25)
  val day = 4
  val result = findMinWeight(chocolates, day)
  println("Minimum weight after $day days: $result")
}