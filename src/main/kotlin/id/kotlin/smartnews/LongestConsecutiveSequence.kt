package id.kotlin.smartnews

class Solution2 {

  fun longestConsecutive(nums: IntArray): Int {
    val numSet = nums.toHashSet()

    var longestStreak = 0
    for (num in numSet) {
      if (!numSet.contains(num - 1)) {
        var currentNum = num
        var currentStreak = 1

        while (numSet.contains(currentNum + 1)) {
          currentNum++
          currentStreak++
        }

        longestStreak = maxOf(longestStreak, currentStreak)
      }
    }

    return longestStreak
  }
}

fun main() {
  val solution2 = Solution2()
  println(solution2.longestConsecutive(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
}