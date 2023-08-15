package id.kotlin.smartnews

class Solution1 {

  fun dailyTemperatures(temperatures: IntArray): IntArray {
    val maxTemperatures = temperatures.size
    val result = IntArray(maxTemperatures)
    val stack = mutableListOf<Int>()

    for (i in 0..<maxTemperatures) {
      while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
        val prevIndex = stack.removeAt(stack.lastIndex)
        result[prevIndex] = i - prevIndex
      }

      stack.add(i)
    }

    return result
  }
}

fun main() {
  val solution1 = Solution1()
  println(solution1.dailyTemperatures(intArrayOf(30, 60, 90)).map { result -> result })
}