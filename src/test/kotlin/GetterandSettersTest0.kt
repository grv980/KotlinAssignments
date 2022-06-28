import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class GetterandSettersTest0 : FunSpec({

    test("main") {
        should { "The client has 500 and has an interest rate of 1.0" }
        should { "The client has 1000 and has an interest rate of 0.5" }
        should { "The client has 1200 and has an interest rate of 0.5" }
    }
})
