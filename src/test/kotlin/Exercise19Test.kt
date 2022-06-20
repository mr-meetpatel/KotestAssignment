import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise19Test : StringSpec({
    val ex19=Exercise19()
    "testcase 1"{
        ex19.whoAreYou(10) shouldBe "Child"
        ex19.whoAreYou(16) shouldBe "Teen"
        ex19.whoAreYou(22) shouldBe "Adult"
    }
})