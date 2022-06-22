class For2 {

    fun main(args:Array<String>){

        val input = readLine()?:""
        val size = input.toInt()

        for(i in 1..size){
            for (j in 1..size){
                when(i * j %3) {
                    0-> println("\uD83D\uDE00\t")
                    1-> println("\uD83E\uDD28\t")
                    2-> println("\uD83D\uDE31\t")
                }

    }
}}}