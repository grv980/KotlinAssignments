import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Interface1Test {

    @Test
    fun main() {

        assertEquals("Waking you up with some Arabica","Waking you up with some Arabica")
        assertEquals("Quenching your thirst with Arabica","Quenching your thirst with Arabica")
        assertEquals("Robusta will wake you up","Robusta will wake you up")
        assertEquals("Robusta will quench your thirst for coffee","Robusta will quench your thirst for coffee")
    }
}