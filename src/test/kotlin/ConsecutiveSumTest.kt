import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ConsecutiveSumTest:FunSpec ({
  context("pass all testcases") {
    val s = ConsecutiveSum()

    test("testcase 1") {
      s.solution(intArrayOf(7,9,1,1,4)) shouldBe 18
    }
  }
})
