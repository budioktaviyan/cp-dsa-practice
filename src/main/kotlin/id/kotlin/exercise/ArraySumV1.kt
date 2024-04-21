package id.kotlin.exercise

import kotlin.system.measureTimeMillis

class Solution9 {

  fun removeDupesAndSum(nums: IntArray): Int {
    val param = IntArray(9999)

    var temp = 0
    for (i in nums.indices) {
      if (nums[i] < param.size) param[nums[i]] = nums[i]
    }

    for (element in param) {
      temp += element
    }
    return temp
  }
}

fun main() {
  val executionTime = measureTimeMillis {
    val solution = Solution9()
    println("Total: ${solution.removeDupesAndSum(intArrayOf(1, 2, 3, 4, 5, 1, 2, 3))}")
  }
  println("Execution time: ${executionTime}ms")
}