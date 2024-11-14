package id.kotlin.tiktok

fun longestCommonPrefix(strs: Array<String>?): String {
  if (strs.isNullOrEmpty()) return ""

  return strs.reduce { prefix, str ->
    prefix.commonPrefixWith(str)
  }
}

fun main() {
  val strs1 = arrayOf("flower", "flow", "flight")
  val strs2 = arrayOf("dog", "racecar", "car")
  println(longestCommonPrefix(strs1))
  println(longestCommonPrefix(strs2))
}