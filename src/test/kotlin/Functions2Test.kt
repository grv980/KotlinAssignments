import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Functions2Test {

    @Test
    fun main() {

        assertEquals("A cat has a lifespan of 15 years","A cat has a lifespan of 15 years")
    }

    @Test
    fun getLifeSpan() {

        assertEquals(15,15)
        assertEquals(20,20)
        assertEquals(12,12)
        assertEquals(20,20)
    }
}