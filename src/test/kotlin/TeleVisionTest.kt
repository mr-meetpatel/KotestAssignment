import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TeleVisionTest:StringSpec({
    var tv=TeleVision()
    "testcase 1"{
        tv.getChannelInfo(1) shouldBe "This Channel in running on 1"
        tv.getChannelInfo(1,true) shouldBe "This Channel in running on 1 and subtitle is On"
        tv.getChannelInfo(2,false) shouldBe "This Channel in running on 2 and subtitle is Off"
        tv.getChannelInfo(2,false) shouldBe "This Channel in running on 1 and time : 11:00 am"
    }
})