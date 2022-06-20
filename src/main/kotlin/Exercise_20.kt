/**
 * Ask the user to input their name.
 * Based on the first letter of their name, print out a personalised greeting
 * for the first 3 letters of the alphabet,
 * a different one for the next 3 letters,
 * and a third message for the rest
 */
class Exercise20{
    fun greetMessage(name:String):String{
        when(name[0]){
            in 'A'..'C' -> return "Have a nice day"
            in 'D'..'F' -> return "Hope you have a great day"
            else -> return "good bye"
        }
    }
}
