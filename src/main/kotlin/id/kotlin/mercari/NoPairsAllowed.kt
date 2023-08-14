package id.kotlin.mercari

class MercariSolution1 {

  fun minSubstitutions(words: List<String>): List<Int> {
    val result = mutableListOf<Int>()

    for (word in words) {
      var substitutions = 0
      var prevChar = word[0]

      for (i in 1..<word.length) {
        prevChar = if (word[i] == prevChar) {
          substitutions++
          ' '
        } else {
          word[i]
        }
      }

      result.add(substitutions)
    }

    return result
  }
}

fun main() {
  val words = listOf("add", "boook", "break")
  val solution1 = MercariSolution1()
  println(solution1.minSubstitutions(words))
}