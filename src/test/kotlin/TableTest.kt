import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TableTest:StringSpec({
    val t1=Table()
    val t2=Table()
    "testcase 1"{
        t1.setData(12.5,10)
        t2.setData(15.0,15)
        t1.showData() shouldBe "Table Height : 12.5 Size : 10"
        t2.showData() shouldBe "Table Height : 15.0 Size : 15"
    }
})