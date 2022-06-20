import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise17Test : StringSpec({
    val ex17=Exercise17()
    "testcase 1"{
        ex17.totalBillAmount() shouldBe 60
    }
})