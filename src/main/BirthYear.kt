class BirthYear {
    fun main(args:Array<String>){
        println("Enter your birth year")
        val yearInput = readLine()?:""
        val year = yearInput.toInt()
        val age = 2022 - year
        println("Your age is $age")
    }
}