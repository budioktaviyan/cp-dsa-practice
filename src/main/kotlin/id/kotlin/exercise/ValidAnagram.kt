package id.kotlin.exercise

object Solution1 {

  fun isAnagram(source: String, target: String): Boolean {
    if (source.length != target.length) return false

    val charCount = source.groupingBy { char -> char }.eachCount().toMutableMap()
    target.map { char ->
      charCount[char] = charCount.getOrDefault(char, 0).minus(1)
      if (charCount[char] == 0) charCount.remove(char)
    }

    return charCount.isEmpty()
  }
}

fun main() {
  val solution1 = Solution1.isAnagram("rat", "car")
  println(solution1)
}