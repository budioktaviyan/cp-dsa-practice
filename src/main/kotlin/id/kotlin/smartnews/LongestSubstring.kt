package id.kotlin.smartnews

/*
  Given a string, find the length of the longest substring without repeating characters

  Example 1:
  Input: "abcabcbb"
  Output: 3
  Explanation: The length is 3 for the substring "abc"

  Example 2:
  Input: "bbbbb"
  Output: 1
  Explanation: The length is 1 for the substring "b"

  Example 3:
  Input: "pwwkew"
  Output: 3
  Explanation: The length is 3 for the substring "wke"
  Note that the answer must be the length of a substring, "pwke" is a subsequence and not a substring
*/
class Solution4 {

  fun lengthOfLongestSubstring(s: String): Int {
    var result = 0
    var start = 0

    val charSet = mutableSetOf<Char>()
    for (end in s.indices) {
      while (charSet.contains(s[end])) {
        charSet.remove(s[start])
        start++
      }

      charSet.add(s[end])
      result = maxOf(result, end - start + 1)
    }

    return result
  }
}

fun main() {
  val solution4 = Solution4()
  println(solution4.lengthOfLongestSubstring("pwwkew"))
}