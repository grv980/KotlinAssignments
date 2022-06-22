import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Also1Test {

    @Test
    fun main() {

        assertEquals("Building a car","Building a car")
        assertEquals("LOG:Building the car Car2@3cd1a2f1","LOG:Building the car Car2@3cd1a2f1")
        assertEquals("Sending a message to the police that car Car2@3cd1a2f1 has been built","Sending a message to the police that car Car2@3cd1a2f1 has been built")
    }
}