class HOF1 {


    fun main(args:Array<String>){
        val clients:ArrayList<String> = arrayListOf("gaurav","kunal","rahul","sonu")
        val messages:ArrayList<String> = getMessages(clients){name->"Hello $name how are you?"}

        println(clients)
        println(messages)

        for (i in 0..clients.size-1){
            println("Message for ${clients[i]}")
            println(messages[i])
            println()
        }
    }

    fun getMessages(clients:Collection<String>, getMessage:(String)->String):ArrayList<String>{
        val messages:ArrayList<String> = arrayListOf<String>()
        for (client:String in clients){
            messages.add(getMessage(client))
        }
        return messages

    }
}