import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class Dataclasses1Test0 : FunSpec({

    test("getArticle") {
     should { "Article(title = Title 27, content = Some content, numberOfReaders=271" }
     should { "Article(title = Title 9, content = Some content, numberOfReaders=166" }
    }

    test("main") {
     should { "Article(title=Title 9 for my blog, content=Some content, numberOfReaders=271" }
     should { "Article(title=Title 27 for my blog, content=Some content, numberOfReaders=271" }
    }
})
