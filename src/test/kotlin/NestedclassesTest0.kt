import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class NestedclassesTest0 : FunSpec({

    test("main") {
        should { "Getting ready for take off" }
        should { "Engine engine1 started" }
        should { "Engine engine2 started" }
        should { "Taking off" }
    }
})
