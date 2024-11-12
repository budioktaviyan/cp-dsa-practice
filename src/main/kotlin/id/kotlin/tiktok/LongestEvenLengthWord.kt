package id.kotlin.tiktok

fun longestEvenWord(sentence: String) =
  sentence
    .split(" ")
    .filter { it.length.rem(2) == 0 }
    .maxByOrNull { it.length } ?: "00"

fun main() {
  val sentence = "It is a pleasant day today"
  println(longestEvenWord(sentence))
}