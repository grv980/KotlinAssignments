import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Dataclasses1Test {

    @Test
    fun getArticle() {
        assertEquals("Article(title = Title 27, content = Some content, numberOfReaders=271","Article(title = Title 27, content = Some content, numberOfReaders=271")
        assertEquals("Article(title = Title 9, content = Some content, numberOfReaders=166","Article(title = Title 9, content = Some content, numberOfReaders=166")
    }

    @Test
    fun main() {
        assertEquals("Article(title=Title 9 for my blog, content=Some content, numberOfReaders=271","Article(title=Title 9 for my blog, content=Some content, numberOfReaders=271")
        assertEquals("Article(title=Title 27 for my blog, content=Some content, numberOfReaders=271","Article(title=Title 27 for my blog, content=Some content, numberOfReaders=271")
    }
}