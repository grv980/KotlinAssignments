class Apply1 {


    class CoffeeCup {
        var clientName = ""
        fun prepareCoffee(){
            println("Brewing the coffee")
        }
    }

    class CoffeeShop {
        fun sellCoffee(name:String){
            CoffeeCup().apply{
                clientName = name
                prepareCoffee()
                println("Serving coffee to client $clientName")
                println(this)

            }
        }
    }

    fun main(args:Array<String>){
        println("Enter your name")
        val name:String = readLine()?:""
        CoffeeShop().sellCoffee(name)


    }
}