class With1 {

    class Store {
        var shoes = 10
        var shirts = 20
        var jackets = 30

        fun printInventory(){
            println("The store has $shoes shoes, $shirts shirts and $jackets jackets")
        }

    }
    fun main(args:Array<String>){

        with(Store()){
            shoes = 25
            shirts = 10
            jackets = 40
            printInventory()
        }
    }
}