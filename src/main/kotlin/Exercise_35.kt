/**
 * Create an online store user account class that has a userName and balance.
 * Create 3 constructors for this class.
 * Inside the constructors, based on the user balance, print out whether they can afford the product tshirt, which costs 20, and if so, how many can they afford.
 */
class OnlineStore{
    var userName:String ?= null
    var balance=0
    val tShirtPrice=20
    constructor(){
        userName="userName"
        balance=0
        isAffortable()
    }
    constructor(userName:String){
        this.userName=userName
        balance=20
        isAffortable()
    }

    constructor(userName: String,balance:Int){
        this.userName=userName
        this.balance=balance
        isAffortable()
    }


    fun isAffortable():Boolean{
        if(balance>=tShirtPrice)
            return true
        return false
    }
}



