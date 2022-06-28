import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Functions2Test0 : FunSpec({

    test("main") {
        should { "A cat has a lifespan of 15 years" }
    }

    test("getLifeSpan") {
        should { 15 }
        should { 20 }
        should { 12 }
        should { 20 }
    }
})
