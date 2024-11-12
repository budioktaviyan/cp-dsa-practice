package id.kotlin.tiktok

fun isRepeating(n: Int): Int {
  val a = mutableSetOf<Int>()

  var num = n
  while (num > 0) {
    val r = num.rem(10)
    if (r in a) return 0

    a.add(r)
    num = num.div(10)
  }

  return 1
}

fun countNumbers(arr: List<Pair<Int, Int>>) {
  val pre = IntArray(1000001)
  for (i in 1 until 1000000) {
    pre[i] = pre[i.minus(1)].plus(isRepeating(i))
  }

  for (q in arr) {
    println(pre[q.second].minus(pre[q.first.minus(1)]))
  }
}

fun main() {
  val arr = listOf(Pair(1, 100), Pair(50, 200))
  countNumbers(arr)
}