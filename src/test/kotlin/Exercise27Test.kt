import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise27Test : StringSpec({
    val ex27=Exercise27()
    "testcase 1"{
        ex27.fetchLifeSpan("cat") shouldBe 15

        ex27.fetchLifeSpan("camel") shouldBe 20
    }
})