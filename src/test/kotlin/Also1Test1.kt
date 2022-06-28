import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Also1Test1 : FunSpec({

    test("main") {
     should { "Building a car" }
     should { "LOG:Building the car Car2@3cd1a2f1" }
     should { "Sending a message to the police that car Car2@3cd1a2f1 has been built" }
    }
})
