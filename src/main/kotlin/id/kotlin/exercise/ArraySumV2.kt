package id.kotlin.exercise

import kotlin.system.measureTimeMillis

class Solution10 {

  fun removeDupesAndSum(nums: IntArray): Int = nums.distinct().sum()
}

fun main() {
  val executionTime = measureTimeMillis {
    val solution = Solution10()
    println("Total: ${solution.removeDupesAndSum(intArrayOf(1, 2, 3, 4, 5, 1, 2, 3))}")
  }
  println("Execution time: ${executionTime}ms")
}