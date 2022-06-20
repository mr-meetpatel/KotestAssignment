import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
internal class CarTest:StringSpec({
    "testcase 1"{
        Car().apply {
            buildingCarProcess() shouldBe "Building Car..."
        }
    }
})