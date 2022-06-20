import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BoschTest : StringSpec({
    var myBoschOven=Bosch()
    var myRoasterOven=Roaster()
    @Test
    fun test(){
        myBoschOven.cooking() shouldBe "Bosch Oven Cooking Speed : 90 and AvgTemp : 120"
        myRoasterOven.cooking() shouldBe "Roaster Oven Cooking Speed : 90 and AvgTemp : 100"
    }
})