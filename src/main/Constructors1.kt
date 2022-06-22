class Constructors1{

    class UserAccount{
        constructor(){
            userName = "Generic user"
            balance = 1
            canAfford()
        }

        constructor(newUserName: String){
            userName = newUserName
            balance = 2
            canAfford()
        }

        constructor(newUserName: String, newBalance: Int){
            userName = newUserName
            balance = newBalance
            canAfford()
        }

        var userName = "User name"
        var balance = 0
        val tshirtPrice = 20

        fun canAfford(){

            if (balance>tshirtPrice){
                println("$userName can afford ${balance/tshirtPrice} tshirts")
            }else {
                println("$userName cannot afford any tshirts")
            }
        }

            }
    fun main(args:Array<String>){
        val user1 = UserAccount()
        val user2 = UserAccount("gaurav")
        val user3 = UserAccount("kunal",175)
        val user4 = UserAccount("rahul",2635)



    }
        }

