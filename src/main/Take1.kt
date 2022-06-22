class Take1 {

    fun main(args:Array<String>){
        val numbers:ArrayList<Int> = arrayListOf<Int>()

        println("Please introduce 10 numbers")
        for (i in 1..10){
            val input:String = readLine()?:""
            val number:Int = input.toInt()

            number.takeIf { it%2!=0 }
                .takeUnless { it==3 || it ==13 }
                ?.let { numbers.add(it) }
        }
        println(numbers)
    }

}