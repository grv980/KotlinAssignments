class Expressions {

    fun main(args: Array<String>) {

        println("Enter your age")
        val input = readLine() ?: "1"
        var age = input.toInt()

        if (age == 0) age = 1
        val result = if (age in 1..12)
            "a child"
        else if (age in 13..17)
            " a teen"
        else
            "an adult"

        println("user is $result")
    }
}