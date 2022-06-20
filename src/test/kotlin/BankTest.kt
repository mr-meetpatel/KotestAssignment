import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankTest : StringSpec({
    var a1=Bank()
    "testcase 1"{
        var list= arrayListOf(100,2000,10000)
        for(i in list){
            a1.balance=i
            if(a1.balance==100)
                a1.getInterest() shouldBe 1.0
            else if(a1.balance==2000)
                a1.getInterest() shouldBe 0.1
            else
                a1.getInterest() shouldBe 0.2

        }

    }
})