/**
 * A group of young people are going to a nightclub.
 * Design a program that accepts user ages.
 * The program displays a welcome message for each user.
 * If it receives an age lower than 18, it prints a message that this client is not allowed.
 * If it receives the word “stop”, the program ends
 */
class Exercise25{
    fun checkEntryToClub(age:Int):String{
        if(age>=18)
            return "Welcome to our club"
        return "Sorry you are not allow"
    }
}
