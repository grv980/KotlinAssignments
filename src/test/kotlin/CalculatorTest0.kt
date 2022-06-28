import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class CalculatorTest0 : FunSpec({

    test("add") {
        should { +10 }
        should { 10 }
    }

    test("sub") {
        should { -25 }

    }

    test("div") {
        should { 20 }
        should { 1.25 }
    }

    test("mul") {
        should { 18.75 }
    }


})
