import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Overloading1Test0 : FunSpec({

    test("cost") {
     should { "A coffee costs 5.988" }
     should { "A cake costs 4.788" }
    }
})
