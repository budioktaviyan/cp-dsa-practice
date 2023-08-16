package id.kotlin.exercise

class Solution7 {

  fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val wordSet = wordDict.toHashSet()
    val result = BooleanArray(s.length + 1)
    result[0] = true

    for (i in 1..s.length) {
      for (j in 0..<i) {
        if (result[j] && wordSet.contains(s.substring(j, i))) {
          result[i] = true
          break
        }
      }
    }

    return result[s.length]
  }
}

fun main() {
  val solution7 = Solution7()
  println(solution7.wordBreak("leetcode", listOf("leet", "code")))
}