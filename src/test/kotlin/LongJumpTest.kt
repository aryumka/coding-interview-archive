import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class LongJumpTest: FunSpec({
  context("pass all testcases") {
    val s = LongJump()

    test("testcase 1") {
      s.solution(4) shouldBe 5
    }

    test("testcase 2") {
      s.solution(3) shouldBe 3
    }
  }
})
