import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise20Test : StringSpec({
    val ex20 =Exercise20()

    "testcase 1"{
        ex20.greetMessage("Amit") shouldBe "Have a nice day"
        ex20.greetMessage("Danish") shouldBe "Hope you have a great day"
        ex20.greetMessage("Meet") shouldBe "good bye"
    }
})