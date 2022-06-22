class Ifstatements {

    fun main(args:Array<String>){

        val hasEggs = true
        val hasBacon = true

        val priceOfEgg = 5
        val priceOfBacon = 20
        var total = 0

        if (hasEggs){
            total += priceOfEgg * 12

            if (hasBacon){
                total += priceOfBacon * 2
            }
        }else {
            println("no eggs available")
        }
        println("Total is $total")
    }
}