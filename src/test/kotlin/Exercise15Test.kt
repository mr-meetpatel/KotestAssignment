import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise15Test : StringSpec({
    val ex15=Exercise15()
    "testcase 1"{
        ex15.companyAcceptedColor() shouldBe "[black]"

        ex15.companyAcceptedColor.add("red")
        ex15.companyAcceptedColor() shouldBe "[black, red]"
    }
})