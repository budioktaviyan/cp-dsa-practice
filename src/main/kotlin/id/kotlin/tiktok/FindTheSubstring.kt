package id.kotlin.tiktok

fun matches(a: String, b: String) = a.indices.all { i -> a[i] == b[i] || a[i] == '*' }

fun firstOccurrence(s: String, x: String) =
  (0 until s.length.minus(x.length))
    .firstOrNull { i -> matches(x, s.substring(i, i.plus(x.length))) } ?: -1

fun main() {
  val solution = firstOccurrence("aaabbc", "aab")
  println(solution)
}