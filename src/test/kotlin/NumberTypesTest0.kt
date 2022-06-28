import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class NumberTypesTest0 : FunSpec({

    test("main") {
     should { 78.99 }
     should { "Double" }
    }
})
