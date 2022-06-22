class TryCatchFinally {
    fun main(args:Array<String>){
        println("what product do you want to buy")

        val input1  = readLine()
        println("How many would you like to buy?")

        val input2 = readLine()

        val price  = 9.99

        try{
            val amount = input2?.toInt()
            println("$amount $input1 will cost ${amount?.times(price)}")


        } catch (e:java.lang.Exception) {
            println("cannot read amount")
            e.printStackTrace()
        }
    }
}