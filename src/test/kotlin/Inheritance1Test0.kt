import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Inheritance1Test0 : FunSpec({

    test("main") {
        should { "Engineer revenue 15000" }
        should { "Engineer salary 20000" }
        should { "Doctor salary 30000" }
        should { "Doctor revenue 40000" }
    }
})
