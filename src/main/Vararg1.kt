class Vararg1 {

    fun printlnHello(count:Int, vararg names:String) {

        for (name in names){
            for(i in 1..count){
                print("Hello $name - ")
            }
            println()
        }
    }

    fun main(args:Array<String>){
        printlnHello(5,"gaurav","kunal","rahul","sonu")
    }
}