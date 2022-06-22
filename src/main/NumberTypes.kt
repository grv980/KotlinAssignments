class NumberTypes {
    fun main(args:Array<String>){

        val numberInput = readLine()?:""
        val number = numberInput.toInt()

        val a1 = 78.99
        val result = number * a1

        println(result)
        println(result::class.java)
    }
}