class Overloading1 {


    fun main(args:Array<String>){
        cost("coffee",4.99)

        val products = mapOf(Pair("cake",3.99),Pair("can of soda",1.50))
    }



    fun cost(product:String,price:Double?){
        println("A $product costs ${price?.times(1.2)}")
    }
        fun cost(products: kotlin.collections.Map<String, Double>){
            for (product in products.keys){
                cost(product,products[product])
            }






    }
}