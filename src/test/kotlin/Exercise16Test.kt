import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise16Test : StringSpec({
    var ex16=Exercise16()
    "testcase 1"{
        ex16.totalAttendance() shouldBe 7253
    }
})