import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise24Test:StringSpec({
    val ex24 = Exercise24()
    "testcase 1" {
        var name = "meet"
        ex24.execute(name) shouldBe "$name Already Added..."
        name = "jay patel"
        ex24.execute(name) shouldBe "$name Already Added..."
    }
})