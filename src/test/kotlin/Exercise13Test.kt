import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise13Test:StringSpec( {
    var ex13 =Exercise13()

    "testcase 1"{
        ex13.addAnimalToTheZoo(listOf("tiger","monkey")) shouldBe "Animal Added..."

    }
})