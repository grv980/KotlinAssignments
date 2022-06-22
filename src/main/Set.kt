class Set {
    fun main(args:Array<String>){

        val customers  = hashSetOf("gaurav","kunal","rahul")
        println("Enter name of joining customer")

        val customer = readLine()?:""
        customers.add(customer)
        println(customers)


        println("Enter name of leaving customer")
        val leavingCustomer = readLine()?:""
        customers.remove(leavingCustomer)
        println(customers)
    }
}