class Operators {
    fun main(args:Array<String>){

        println("Enter the amount you have in your Bank Amount")

        val  amountInput = readLine()?:""
        val amount = amountInput.toDouble()

        val amountAfter5years = amount * 1.055 * 1.055 * 1.055 * 1.055 * 1.055

        println("After 5 years you will have $amountAfter5years")



    }
}