package id.kotlin.mercari

import kotlin.math.abs

class MercariSolution2 {

  fun minTotalCost(arr: Array<Int>): Int {
    val total = arr.size
    val sortedArr = arr.sorted()

    var minCost = Int.MAX_VALUE
    for (i in 0..<total) {
      var totalCost = 0
      val target = sortedArr[i]

      for (j in 0..<total) {
        totalCost += abs(arr[j] - target)
      }

      minCost = minOf(minCost, totalCost)
    }

    return minCost
  }
}

fun main() {
  val nums = arrayOf(1, 2, 1, 5)
  val solution2 = MercariSolution2()
  println(solution2.minTotalCost(nums))
}