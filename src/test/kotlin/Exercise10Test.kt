import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise10Test:StringSpec({
    val ex10 = Exercise10()
    "testcase 1" {
        ex10.getPrice(10) shouldBe 10 * 29.99f
    }
    "testcase 2" {
    ex10.getPrice(15) shouldBe 15 * 29.99f
}

})