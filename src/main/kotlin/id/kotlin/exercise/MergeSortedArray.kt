package id.kotlin.exercise

object Solution5 {

  fun merge(numsX: IntArray, lenA: Int, numsY: IntArray, lenB: Int) {
    var i = lenA.minus(1)
    var j = lenB.minus(1)
    var k = lenA.plus(lenB).minus(1)

    while (j >= 0) {
      numsX[k--] = if (i >= 0 && numsX[i] > numsY[j]) numsX[i--] else numsY[j--]
    }
  }
}

fun main() {
  val nums1 = intArrayOf(0)
  val m = 0
  val nums2 = intArrayOf(1)
  val n = 1

  Solution5.merge(nums1, m, nums2, n)
  println(nums1.contentToString())
}