import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class Exercise11Test:StringSpec({
    val ex11=Exercise11()
    "testcase 1"{
        var pname="chips"
        var pquantity=""
        ex11.genrateBill(pname,pquantity) shouldBe "Exception Occur"
    }
    "testcase 2"{
        var pname="chips"
        var pquantity="10"
        ex11.genrateBill(pname,pquantity) shouldBe "$pname : ${pquantity.toInt().times(9.99)}"
    }

})