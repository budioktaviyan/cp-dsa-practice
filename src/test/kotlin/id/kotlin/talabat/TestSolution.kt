package id.kotlin.talabat

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class TestSolution {

  private lateinit var solution: Solution

  @BeforeTest
  fun setup() {
    solution = Solution()
  }

  @Test
  fun testAcceptCommandR() {
    val result = solution.acceptCommand("R")
    assertEquals(result, "0:0:E")
  }

  @Test
  fun testAcceptCommandL() {
    val result = solution.acceptCommand("L")
    assertEquals(result, "0:0:W")
  }

  @Test
  fun testAcceptCommandM() {
    val result = solution.acceptCommand("M")
    assertEquals(result, "0:1:N")
  }

  @Test
  fun testAcceptCommandRMMLML() {
    val result = solution.acceptCommand("RMMLML")
    assertEquals(result, "2:1:W")
  }
}