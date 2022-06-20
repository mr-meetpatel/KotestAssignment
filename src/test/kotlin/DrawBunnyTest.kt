import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class DrawBunnyTest: StringSpec({
    "DrawBunny Test Case 1"{
        val l1="(\\(\\"
        val l2="(-.-)"
        val l3="o_(\")(\")"
        val bunny=l1+"\n"+l2+"\n"+l3
        DrawBunny().drawBunny() shouldBe bunny
    }

})

