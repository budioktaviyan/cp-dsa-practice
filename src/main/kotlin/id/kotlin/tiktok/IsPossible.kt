package id.kotlin.tiktok

fun getAnswer(a: Int, b: Int, c: Int, d: Int): Boolean =
  when {
    a > c || b > d -> false
    a == c && b == d -> true
    else -> getAnswer(a + b, b, c, d) || getAnswer(a, a + b, c, d)
  }

fun isPossible(a: Int, b: Int, c: Int, d: Int) =
  if (getAnswer(a, b, c, d)) "Yes" else "No"

fun main() {
  val result = isPossible(2, 2, 1000, 998)
  println(result)
}