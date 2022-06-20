import javax.naming.ldap.UnsolicitedNotification

/**
 * Ask the user to input a number and read it into a variable.
 * Convert it to an integer.
 * Multiply that value with a double variable that you created.
 * What is the type of the new variable?
 * Print it to the console.
 */
class Exercise5{
    fun getAns(num:Int):String{
        var ans =3.14*num
        return "Ans : ${ans} and Type : ${ans::class.java}"
    }
}
