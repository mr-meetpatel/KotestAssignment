import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise14Test :StringSpec({
    var ex14=Exercise14()
    "testcase 1"{
        ex14.addUserToList("bhavin") shouldBe "User Added..."
        ex14.removeUserFromTheList("jay") shouldBe "User Removed..."
        ex14.displayAllUser() shouldBe "[bhavin, meet, mihir]"
    }
})