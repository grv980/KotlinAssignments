import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Abstraction1Test0 : FunSpec({

    test("main") {
     should { "Bosch oven is cooking in 120 and at 180" }
        should { "A roaster roasts at 210 for 120 minutes" }
    }
})
