class ListandArraylist  {

    fun main(args:Array<String>){

        val items = arrayListOf("laptop","mouse","paper","pen","mug","phone")
        val removedItems = listOf("pen","paper","mug","phone")

        items.removeAll(removedItems)
    println(items)
    }
}