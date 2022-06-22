class Elvis {

    fun main(args:Array<String>){

        val priceOfProduct = 29.99
        println("How many products would you like to buy?")

        val input  = readLine()
        val productPurchased = input?.toInt()?:1

        println("total amount is ${productPurchased * priceOfProduct}")
    }
}