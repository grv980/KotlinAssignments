import kotlin.random.Random

class Typecasting1 {
    abstract class Animal

    class Dog : Animal(){
        fun bark(){
            println("Dog is barking")
        }
    }
    class Cat:Animal(){
        fun purr(){
            println("Cat is purring")
        }
    }
    fun getAnimals():ArrayList<Animal> {
        val animals: ArrayList<Animal> = arrayListOf<Animal>()
        for (i: Int in 1..5) {
            animals.add(
                if (Random.nextInt() % 2 == 0)
                    Dog()
                else Cat()

            )
        }
        return animals
    }
    fun main(args:Array<String>){
        val animals:ArrayList<Animal> = getAnimals()
        animals.forEach{
            animal ->
            (animal as? Dog)?.bark()
            (animal as? Cat)?.purr()
        }
    }



}
