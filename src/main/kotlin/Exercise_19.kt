/**
 * Ask a user to input their age.
 * If they are under 13, they are a child.
 * If they are under 18, they are a teen.
 * If they are older, they are an adult.
 * Use ranges to print out the correct message.
 * If the age is 0, convert it to 1.
 */
class Exercise19{
    fun whoAreYou(age:Int):String{
        var a=age
        if (a==0) a+=1
        val res = if (a in 1..12)
            "Child"
        else if (a in 13..17)
            "Teen"
        else
            "Adult"
        return res
    }
}
