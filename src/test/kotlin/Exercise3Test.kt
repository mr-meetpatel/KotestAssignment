import Udemy.Exercise3
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise3Test: StringSpec({

    "Ex3 Testcase 1"{
        val obj1=Exercise3()
        obj1.setData("Meet",5,10)
        obj1.getData() shouldBe "Hello ${obj1.clientName} you need pay ${obj1.productQuantity * obj1.productPrice}"
    }
    "Ex3 Testcase 2"{
        val obj1=Exercise3()
        obj1.setData("Jay",50,10)
        obj1.getData() shouldBe "Hello ${obj1.clientName} you need pay ${obj1.productQuantity * obj1.productPrice}"
    }
})