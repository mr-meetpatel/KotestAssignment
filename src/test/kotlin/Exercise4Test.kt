import Udemy.Exercise3
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise4Test: StringSpec({

    "Ex4 Testcase 1"{
        val obj1= Exercise4()
        val year=2000
        obj1.getAge(year) shouldBe 2022-year
    }
    "Ex4 Testcase 2"{
        val obj1= Exercise4()
        val year=2001
        obj1.getAge(year) shouldBe 2022-year
    }
})