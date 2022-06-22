class Also1 {

    class Car1{
        fun buildCar(){
            println("Building a car")
        }
    }

    fun main(args:Array<String>){
        Car1().apply {
            buildCar()
        }
            .also {
                println("LOG:Building the car $it")
                println("Sending a message to the police car $it has been built")
            }
    }
}