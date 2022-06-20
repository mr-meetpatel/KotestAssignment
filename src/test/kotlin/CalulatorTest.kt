import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertEquals
class CalulatorTest : StringSpec({
    val cal=Calulator()
    @Test
    fun testCal(){
        cal.add(100).toString() shouldBe "100"
        cal.sub(10).toString() shouldBe "90"
        cal.mul(4).toString() shouldBe "360"
        cal.div(2).toString() shouldBe "180"
        cal.reset().toString() shouldBe "0"
    }
})