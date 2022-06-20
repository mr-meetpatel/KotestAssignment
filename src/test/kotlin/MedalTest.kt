import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MedalTest:StringSpec({
    val game=Olympic()
    "testcase 1"{
        game.getMedal(1).toString() shouldBe "GOLD"
        game.getMedal(2).toString() shouldBe "SILVER"
        game.getPosition(Medal.GOLD).toString() shouldBe "1"
    }
})