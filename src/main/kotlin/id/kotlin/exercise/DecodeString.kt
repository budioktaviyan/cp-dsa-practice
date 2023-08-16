package id.kotlin.exercise

class Solution8 {

  fun decodeString(s: String): String {
    val numStack = mutableListOf<Int>()
    val strStack = mutableListOf<String>()
    var currentNum = 0
    var currentStr = ""

    for (c in s) {
      when {
        c.isDigit() -> currentNum = currentNum * 10 + (c - '0')
        c == '[' -> {
          numStack.add(currentNum)
          strStack.add(currentStr)
          currentNum = 0
          currentStr = ""
        }
        c == ']' -> {
          val num = numStack.removeAt(numStack.lastIndex)
          val prevStr = strStack.removeAt(strStack.lastIndex)
          currentStr = prevStr + currentStr.repeat(num)
        }

        else -> currentStr += c
      }
    }

    return currentStr
  }
}

fun main() {
  val solution8 = Solution8()
  println(solution8.decodeString("3[a2[c]]"))
}