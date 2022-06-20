import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SonTest : StringSpec({
 val son = Son()

    "testcase 1"{

        son.printFullName() shouldBe "Patel Meet Mitesh"
    }
})