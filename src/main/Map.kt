class Map {

    fun main(args:Array<String>){

        val attendance = hashMapOf(Pair("23 sept", 3475), Pair("24 sept",4353), Pair("25 sept",3254))
        attendance["26 sept"] = 9348

        val peopleOn25 = attendance["25 sept"]?:0
        val peopleOn26 = attendance["26 sept"]?:0

        println("Total number of people on 25 and 26 of sept: ${peopleOn25 + peopleOn26}")

        println("Is data available for 22 Sept? : ${attendance.containsKey("22 sept")}")
    }
}