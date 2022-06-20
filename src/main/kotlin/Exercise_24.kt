/**
 * You have a set of usernames
 * val usernames = hashSetOf(“john”, “bob”, “alice”)
 * Ask the user to choose their username. If their username is taken, print out a message and ask again.
 * Add the username to the set.
 */
class Exercise24{
    var userNameList = hashSetOf("meet","jay","mihir")
    var stop=false

    fun execute(name:String):String{
        var stop=false
        do{


            if(name in userNameList)
                return "$name Already Added..."
            else{


                userNameList.add(name)
                stop=true
            }
        } while (!stop)

        return "$name Added..."
    }
}

