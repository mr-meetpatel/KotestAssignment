/**
 * You have a list of customers for your online store.
 * A new customer has joined.
 * Print the list of customers.
 * A customer has chosen to leave.
 * Print the list of customers.
 */
class Exercise14{
    var custList= hashSetOf("meet","jay","mihir")
    fun addUserToList(userName:String):String{
        custList.add(userName)
        return "User Added..."
    }
    fun removeUserFromTheList(userName:String):String{
        custList.remove(userName)
        return "User Removed..."
    }
    fun displayAllUser(): String {
        return custList.toString()
    }
}

