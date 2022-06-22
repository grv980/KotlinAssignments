class ListFunctions {


    fun main(args:Array<String>){

        val animals = arrayListOf("lion","zebra","chimp","elephant")
        animals.add("panda")

        println(animals)

        animals.remove("lion")
        println(animals)

        val compareAnimals = listOf("elephant","giraffe")

        val hasAllAnimals  = animals.containsAll(compareAnimals)

        println("Does the zoo have all the animals? : $hasAllAnimals")
    }
}