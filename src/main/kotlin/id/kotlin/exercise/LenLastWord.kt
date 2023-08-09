package id.kotlin.exercise

object Solution6 {

  fun lengthOfLastWord(source: String) = source.trim().split(" ").last().length
}

fun main() {
  val solution6 = Solution6.lengthOfLastWord("   fly me   to   the moon  ")
  println(solution6)
}