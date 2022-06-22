class Lazy1 {


    class NewUser{
        fun printWelcome(){
            println("Welcome to the course!")
        }
    }

    fun main(args:Array<String>){

        val newUser:NewUser by lazy { NewUser() }
        val banned:List<String> = listOf("john","brad","tom","")

        println("Enter a username")

        val input:String = readLine()?:""
        if (!banned.contains(input))
            newUser.printWelcome()
    }
}