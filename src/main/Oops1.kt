class Calculator {
    var total = 0.0

    fun add(a:Double){

        total +=a
        println("+ $a")
        println("=$total")
    }

    fun sub(a:Double){

        total -= a
        println("- $a")
        println("= $total")
    }

    fun div(a:Double){
        total /= a
        println("/ $a")
        println("= $total")
    }

    fun mul(a:Double){
        total *= a
        println(" * $a")
        println("= $total")
    }

    fun reset(){
        total = 0.0
        println("= $total")
    }
    fun main(args:Array<String>){
        val calc = Calculator()
        calc.add(10.0)
        calc.sub(10.0)
        calc.div(10.0)
    }


}