import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise8Test:StringSpec({
    val ex8 = Exercise8()
    "testcase1"{
        ex8.isFundingApprove(3,1,2) shouldBe true
    }
    "testcase2"{
        ex8.isFundingApprove(7,7,2) shouldBe false
    }
    "testcase3"{
        ex8.isFundingApprove(3,0,2) shouldBe false
    }
})