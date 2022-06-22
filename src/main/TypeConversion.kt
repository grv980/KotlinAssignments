class TypeConversion {
    fun main(args:Array<String>){

        println("Enter a number of type Double")
        val numberInput = readLine()?:""
        val number = numberInput.toDouble()

        val pi = 3.14159
        val result = number * pi

        println(result)

        println(result::class.java)
    }
}