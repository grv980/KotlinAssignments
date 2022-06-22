class Run1 {

    class Laptop{
        fun turnOff(){
            println("Turning laptop OFF")
        }
        fun turnOn(){
            println("Turning laptop ON")
        }
    }

    fun main(args:Array<String>){
        Laptop().run {
            turnOff()
            turnOn()
        }
    }
}