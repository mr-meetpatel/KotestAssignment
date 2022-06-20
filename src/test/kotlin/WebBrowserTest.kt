import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WebBrowserTest:StringSpec({
    val wb=WebBrowser()
    "testcase 1"{
        wb.url shouldBe "https://www.google.com"
    }
})