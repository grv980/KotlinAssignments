class Functions2 {


    fun main(args:Array<String>){
        println("Enter an animal")

        val animal = readLine()?:""
        val lifespan = getLifeSpan(animal)
        println("A $animal has a lifespan of $lifespan years")
    }

    fun getLifeSpan(name:String):Int {
        val lifespan = when(name){
            "cat"->15
            "dog"->20
            "rabbit"->12
            else->20
        }
        return lifespan
    }
}