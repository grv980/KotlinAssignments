class Breakandcontinue {


    fun main(args:Array<String>){

        while (true){
            println("Enter your age")

            val input = readLine()?:""
            if (input=="stop")
                break

            val age = input.toInt()
            if (age<18){
                println("Sorry you cannot go in")

                continue
            }
            println("Welcome to the club")
        }
    }
}