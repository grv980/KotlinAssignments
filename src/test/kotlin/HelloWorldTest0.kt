import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class HelloWorldTest0 : FunSpec({

    test("main") {
        should { "Hello World" }
    }
})
