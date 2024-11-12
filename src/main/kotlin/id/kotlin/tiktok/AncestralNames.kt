package id.kotlin.tiktok

fun romanToInt(value: String): Int {
  val romanValues = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
  )

  var result = 0
  var prevValue = 0
  for (char in value.reversed()) {
    val romanValue = romanValues[char] ?: 0
    if (romanValue >= prevValue) result = result.plus(romanValue)
    result = result.minus(romanValue)
    prevValue = romanValue
  }

  return result
}

fun sortRoman(values: List<String>): List<String> =
  values.sortedWith(
    compareBy(
      { it.split(" ")[0] },
      { romanToInt(it.split(" ")[1]) }
    )
  )

fun main() {
  val arr = listOf("47", "Vasyl XXXIII", "Eryk XXXI", "Neal XXXIV", "Anicka XXXVII")
  val result = sortRoman(arr)
  println(result.joinToString("\n"))
}