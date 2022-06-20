import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise18Test : StringSpec({
    val ex18=Exercise18()
    "testcase 1"{
       ex18.getGradeOnBaseOfMark(98) shouldBe "A"
       ex18.getGradeOnBaseOfMark(86) shouldBe "B"
       ex18.getGradeOnBaseOfMark(105) shouldBe "Marks cannot be greater than 100"
    }
})