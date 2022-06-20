import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class HelloWorldTest : StringSpec({
    "Test Case 1"{
        var str="World"
        HelloWorld().printMsg(str) shouldBe "Hello $str"
    }
    "Test Case 2"{
        var str="Meet"
        HelloWorld().printMsg(str) shouldBe "Hello $str"
    }
})