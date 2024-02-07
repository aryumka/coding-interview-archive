import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

class TangerineTest: FunSpec ({
  context("pass all testcases") {
    val s = Tangerine()

    test("testcase 1") {
      s.solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)) shouldBe 3
    }

    test("testcase 2") {
      s.solution(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)) shouldBe 2
    }

    test("testcase 3") {
      s.solution(2, intArrayOf(1, 1, 1, 1, 2, 2, 2, 3)) shouldBe 1
    }
  }
})
