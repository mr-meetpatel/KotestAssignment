import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise7Test:StringSpec({
    "testase1"{
        Exercise7(10,3.5f,5).getSimpleInterest() shouldBe ((10*3.5*5)/100)
    }
})