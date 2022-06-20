import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LaptopTest : StringSpec({
    "testcase 1"{
        Laptop().run {
            turnOn() shouldBe "Laptop is Turing On"
            turnOff() shouldBe "Laptop is Turing Off"
        }
    }
})