import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SquareTest:StringSpec({
    val circle =Geometery<Shape>()
    val square=Geometery<Shape>()
    "testcase 1"{
        circle.printAnswer(Circle(),10,"Circle") shouldBe "Area of Circle is 314.0"
        circle.printAnswer(Square(),12,"Square") shouldBe "Area of Square is 144.0"
    }
})