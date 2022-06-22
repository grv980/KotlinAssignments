import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BunnyTest {

    @Test
    fun main() {

        assertEquals("(\\(\\","(\\(\\")
        assertEquals("(-.-)","(-.-)")
        assertEquals("o_(\")(\")","o_(\")(\")")
    }
}