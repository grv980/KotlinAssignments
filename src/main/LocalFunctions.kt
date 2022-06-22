class LocalFunctions {


    fun printGreeting(){

        fun sayHi(name:String){
            println("Hi $name how are you?")
        }

        while (true){
            println("Enter a name")
            val name = readLine()?:""
            if(name =="")
                break

            sayHi(name)
        }
    }
    fun main(args:Array<String>){
        printGreeting()
    }
}