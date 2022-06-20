import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise23Test:StringSpec({
    val ex23 =Exercise23()

    "testcase 1"{
        ex23.getNumberDivisibleBy7(30) shouldBe "7 14 21 28 "
        ex23.getNumberDivisibleBy7(15) shouldBe "7 14 "
    }
})