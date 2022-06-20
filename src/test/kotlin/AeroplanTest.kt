import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AeroplanTest :StringSpec({
    val aero=Aeroplan()
    "testcase 1"{
        aero.takeOffPlane() shouldBe  "Engine Engine1 Started...\n" +
                "Engine Engine2 Started...\n" +
                "Engine Engine3 Started...\n" +
                "takingOff Plane..."

        aero.landPlane() shouldBe "landing plane...\n" +
                "Engine Engine1 Stop...\n" +
                "Engine Engine2 Stop...\n" +
                "Engine Engine3 Stop..."
    }
})