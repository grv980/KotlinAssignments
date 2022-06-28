import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Interface1Test0 : FunSpec({

    test("main") {
     should { "Waking you up with some Arabica" }
     should { "Quenching your thirst with Arabica" }
     should { "Robusta will wake you up" }
     should { "Robusta will quench your thirst for coffee" }
    }
})
