class Extensionfunctions {

    fun main(args:Array<String>){
        val list:ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9)
        println(list.howMany())

    }
    fun ArrayList<Int>.howMany() = "This list contains $size elements"
}