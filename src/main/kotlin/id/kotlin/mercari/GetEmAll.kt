package id.kotlin.mercari

class MercariSolution3 {

  fun maxProfit(arr: Array<Int>, x: Int, y: Int, z: Int): Int {
    val total = arr.size

    var maxProfit = 0
    for (i in 0..x) {
      for (j in 0..y) {
        for (k in 0..z) {
          if (i + 2 * j + 3 * k <= total) {
            var sum = 0
            var index = 0

            for (c in 0..<i) {
              sum += arr[index]
              index++
            }

            for (c in 0..<j) {
              sum += arr[index] + arr[index + 1]
              index += 2
            }

            for (c in 0..<k) {
              sum += arr[index] + arr[index + 1] + arr[index + 2]
              index += 3
            }

            maxProfit = maxProfit.coerceAtLeast(sum)
          }
        }
      }
    }

    return maxProfit
  }
}

fun main() {
  val arr = arrayOf(2, 5, 3, 1, 0, 0)
  val x = 1
  val y = 1
  val z = 1
  val solution3 = MercariSolution3()
  println(solution3.maxProfit(arr, x, y, z))
}