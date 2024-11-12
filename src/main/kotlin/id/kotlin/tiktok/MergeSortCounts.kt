package id.kotlin.tiktok

fun mergesort(a: List<Int>): Pair<List<Int>, List<Int>> {
  val n = a.size
  if (n == 1) return Pair(a, listOf(0))

  val m = (n.plus(1)).div(2)
  val (x, rA) = mergesort(a.subList(0, m))
  val (y, rB) = mergesort(a.subList(m, n))

  val res = mutableListOf<Int>()
  var idx1 = 0
  var idx2 = 0
  while (idx1 < x.size || idx2 < y.size) {
    if (idx2 == y.size || (idx1 < x.size && x[idx1] < y[idx2])) {
      res.add(rA[idx1])
      idx1 = idx1.inc()
    } else {
      res.add(rB[idx2].plus(if (idx1 < x.size) 1 else 0))
      idx2 = idx2.inc()
    }
  }

  return Pair(a.sorted(), res)
}

fun largestCountValue(a: List<Int>) =
  mergesort(a).second.maxOrNull() ?: 0

fun main() {
  val arr = listOf(100000, 100000, 99999, 99998, 99997)
  val result = largestCountValue(arr)
  println(result)
}