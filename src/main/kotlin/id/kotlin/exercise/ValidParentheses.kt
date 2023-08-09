package id.kotlin.exercise

object Solution3 {

  fun isValid(source: String): Boolean {
    val stack = mutableListOf<Char>()
    val bracket = mapOf(')' to '(', '}' to '{', ']' to '[')

    return source.all { char ->
      when (char) {
        in bracket.values -> stack.add(char)
        in bracket.keys -> stack.isNotEmpty() && stack.removeLastOrNull() == bracket[char]
        else -> true
      }
    } && stack.isEmpty()
  }
}

fun main() {
  val solution3 = Solution3.isValid("(){}[]")
  println(solution3)
}