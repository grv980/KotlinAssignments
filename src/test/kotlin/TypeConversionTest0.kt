import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class TypeConversionTest0 : FunSpec({

    test("main") {
     should { 3.14159 }
     should { "Double" }
    }
})
