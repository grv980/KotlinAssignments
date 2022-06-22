class Abstraction1 {


    abstract class DefaultOven {
        val cookingSpeed = 120
        open val averageTemperature = 180

        abstract fun cooking()

    }
    class Bosch:DefaultOven(){
        override val averageTemperature = 210

        override fun cooking() {
            println("Bosch oven is cooking in $cookingSpeed and at $averageTemperature temperature")
        }
    }

    class Roaster:DefaultOven(){

        override fun cooking() {
            println("A roaster roasts at $averageTemperature for $cookingSpeed minutes")
        }
    }

    fun main(args:Array<String>){

        val myOven:DefaultOven = Bosch()
        val myRoaster:DefaultOven = Roaster()

        myOven.cooking()
        myRoaster.cooking()
    }
}