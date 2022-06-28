import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Init1Test0 : FunSpec({

    test("browser") {
     should { "web browser is connecting" }
     should { "http://www.google.com" }
    }
})
