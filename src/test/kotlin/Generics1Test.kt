import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Generics1Test {

    @Test
    fun main() {
        assertEquals("The item converted to a String is 36.453","The item converted to a String is 36.453")
        assertEquals("The item converted to a String is {two=2, one=1, thirty five=35}","The item converted to a String is {two=2, one=1, thirty five=35}")
    }
}