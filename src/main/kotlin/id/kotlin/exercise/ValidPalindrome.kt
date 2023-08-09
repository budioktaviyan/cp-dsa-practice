package id.kotlin.exercise

object Solution2 {

  fun isPalindrome(source: String): Boolean {
    val result = source.lowercase().filter { char -> char.isLetterOrDigit() }.trim()
    return result == result.reversed()
  }
}

fun main() {
  val solution2 = Solution2.isPalindrome("race a car")
  println(solution2)
}