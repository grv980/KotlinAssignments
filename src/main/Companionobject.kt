class Companionobject {

    fun Double.Companion.printClassName(){
        println("This is a Double class")
    }

    fun main(args:Array<String>){
        Double.printClassName()
    }
}