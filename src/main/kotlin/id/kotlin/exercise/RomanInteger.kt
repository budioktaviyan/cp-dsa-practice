package id.kotlin.exercise

object Solution4 {

  fun romanToInt(source: String): Int {
    val romanNumber = mapOf(
      'I' to 1,
      'V' to 5,
      'X' to 10,
      'L' to 50,
      'C' to 100,
      'D' to 500,
      'M' to 1000
    )

    var result = 0
    var prevNumber = 0

    for (char in source.reversed()) {
      val number = romanNumber[char] ?: 0

      if (number >= prevNumber) {
        result += number
      } else {
        result -= number
      }

      prevNumber = number
    }

    return result
  }
}

fun main() {
  val solution4 = Solution4.romanToInt("MCMXCIV")
  println(solution4)
}