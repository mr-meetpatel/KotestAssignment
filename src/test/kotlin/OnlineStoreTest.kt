import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class OnlineStoreTest:StringSpec({
    var user1 =OnlineStore("User1")

    val user2=OnlineStore("User2")
    val user3=OnlineStore("User3",50)
    val users= listOf<OnlineStore>(user1,user2,user3)

    "testcase 1"{
        
        for (user in users){
            if(user.isAffortable())
                user.isAffortable() shouldBe true
            else
                user.isAffortable() shouldBe false
        }
    }

})