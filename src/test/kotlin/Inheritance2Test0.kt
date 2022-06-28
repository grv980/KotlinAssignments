import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Inheritance2Test0 : FunSpec({

    test("main") {
     should { "My name is Michael Smith" }
        should { "My father's name is John Smith" }
    }
})
