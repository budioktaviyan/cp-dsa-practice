package id.kotlin.tiktok

fun intToRoman(number: Int): String {
  val numberValues = mapOf(
    1000 to "M",
    900 to "CM",
    500 to "D",
    400 to "CD",
    100 to "C",
    90 to "XC",
    50 to "L",
    40 to "XL",
    10 to "X",
    9 to "IX",
    5 to "V",
    4 to "IV",
    1 to "I"
  )

  var remainingNumber = number
  val result = StringBuilder()

  for ((value, numberValue) in numberValues) {
    while (remainingNumber >= value) {
      result.append(numberValue)
      remainingNumber = remainingNumber.minus(value)
    }
  }

  return result.toString()
}

fun romanizer(numbers: Array<Int>): Array<String> =
  numbers.map { intToRoman(it) }.toTypedArray()

fun main() {
  val numbers = arrayOf(1, 4, 9, 23)
  val numberValues = romanizer(numbers)
  val solution = numberValues.joinToString(", ")
  println(solution)
}