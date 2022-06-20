import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise28Test :StringSpec({
    val ex28=Exercise28()
    "testcase 1"{
        var product="tea"
        var price=20.0
        ex28.cost(product,price) shouldBe "$product : ${price?.times(1.2)}"
    }
})