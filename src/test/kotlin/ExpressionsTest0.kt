import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class ExpressionsTest0 : FunSpec({

    test("main") {
     should { "a child" }
        should { "a teen" }
        should { "an adult" }
    }
})
