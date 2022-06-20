import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CoffeeShopTest:StringSpec({
    val cs=CoffeeShop()
    "testcase 1"{
        var name="Meet"
        cs.sellCoffee(name) shouldBe "Your coffee is ready $name..."
        name="Mitesh"
        cs.sellCoffee(name) shouldBe "Your coffee is ready $name..."
        name="Jack"
        cs.sellCoffee(name) shouldBe "Your coffee is ready $name..."
    }
})