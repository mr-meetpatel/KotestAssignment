import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise5Test: StringSpec({
    "Testcase 1"{
        val num=4
        val ans=3.14*num
        Exercise5().getAns(num) shouldBe "Ans : ${ans} and Type : ${ans::class.java}"
    }
    "Testcase 2"{
        val num=5
        val ans=3.14*num
        Exercise5().getAns(num) shouldBe "Ans : ${ans} and Type : ${ans::class.java}"
    }
})