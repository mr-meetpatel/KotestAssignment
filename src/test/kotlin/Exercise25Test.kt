import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise25Test : StringSpec({
    val ex25=Exercise25()
    "testcase 1"{
        ex25.checkEntryToClub(18) shouldBe "Welcome to our club"
        ex25.checkEntryToClub(38) shouldBe "Welcome to our club"
        ex25.checkEntryToClub(5) shouldBe  "Sorry you are not allow"
    }
})