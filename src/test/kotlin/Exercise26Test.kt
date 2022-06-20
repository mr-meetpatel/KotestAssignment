import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise26Test : StringSpec({
    val ex26=Exercise26()
    "testcase 1"{
        var name="Meet"
        var birthYear=2000
        ex26.nameAndAge(name,birthYear) shouldBe "Hii $name your age is ${2022-birthYear}"
    }
})