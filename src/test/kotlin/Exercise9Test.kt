import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise9Test:StringSpec({
    val ex9 = Exercise9()
    "testcase 1"{
        val data=7.0
        ex9.getLenth(data) shouldBe data.times(7).toString().length
    }
    "testcase 2"{
        val data=10.0
        ex9.getLenth(data) shouldBe data.times(7).toString().length
    }
})