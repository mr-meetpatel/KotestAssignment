import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StoreTest:StringSpec({
    "testcase 1"{
        with(Store()){
            shirts=10
            jackets=10
            shoes=10
            printAll() shouldBe "Shoes : 10\n" +
                    "Shirts : 10\n" +
                    "Jackets : 10"
        }
    }
})