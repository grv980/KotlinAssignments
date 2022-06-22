class Functions1 {

    fun main(args:Array<String>){
        for (i in 1..3) {
           askDetails()
    }
}

fun askDetails(){

    println("Enter your name")
    val name = readLine()?:""
    println("Enter your birth year")
    val input = readLine()?:""
    val year = input.toInt()

    println("$name is ${2022-year} years old")

}}