import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise12Test : StringSpec({
    val ex12=Exercise12()
    "testcase 1"{

        ex12.removeItemFromTheList(arrayListOf("laptop", "mouse"),listOf("laptop")) shouldBe "[mouse]"
    }
})