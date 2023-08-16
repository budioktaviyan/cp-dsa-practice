package id.kotlin.smartnews

class Solution3 {

  fun trap(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var maxLeft = 0
    var maxRight = 0

    var result = 0
    while (left < right) {
      if (height[left] < height[right]) {
        maxLeft = maxOf(maxLeft, height[left])
        result += maxLeft - height[left]
        left++
      } else {
        maxRight = maxOf(maxRight, height[right])
        result += maxRight - height[right]
        right--
      }
    }

    return result
  }
}

fun main() {
  val solution3 = Solution3()
  println(solution3.trap(intArrayOf(4, 2, 0, 3, 2, 5)))
}