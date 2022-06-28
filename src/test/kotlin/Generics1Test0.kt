import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Generics1Test0 : FunSpec({

    test("main") {
     should { "The item converted to a String is 36.453" }
     should { "The item converted to a String is {two=2, one=1, thirty five=35}" }
    }
})
