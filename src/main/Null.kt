class Null {

    fun main(args:Array<String>){
        println("Enter a number")

        val input = readLine()
        val number = input?.toDouble()?.times(7)

        println("Length of $number is ${number?.toString()?.length}")
    }
}