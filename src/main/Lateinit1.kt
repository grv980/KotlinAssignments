class Lateinit1 {

    fun selectPrimeNumber(primes:List<Int>) = primes.random()


    fun main(args:Array<String>){
        lateinit var message:String

        val primeNumbers:List<Int> = listOf(2,3,5,7,11,13,17,23)
        message= "The chosen prime number is ${selectPrimeNumber(primeNumbers)}"
        println(message)
    }
}