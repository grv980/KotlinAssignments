import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Constructors1Test0 : FunSpec({

    test("main") {
        should { "Generic user cannot afford any tshirts" }
        should { "gaurav cannot afford any tshirts" }
        should { "kunal can afford 8 tshirts" }
        should { "rahul can afford 131 tshirts" }
    }
})
