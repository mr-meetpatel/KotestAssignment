/**
 * Ask the user to input a large integer.
 * Print out all the numbers that are divisible by 7, that are less than the user’s number.
 */
class Exercise23{
    fun getNumberDivisibleBy7(number:Int):String{
        var res=""
        var i=1
        while(i < number){
            if(i%7==0){

                res+=i.toString()+" "
            }
            i++
        }
        return res
    }
}
