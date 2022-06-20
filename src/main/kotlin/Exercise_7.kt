/**
 * Read from the console the amount the user has in their bank account.
 * The interest on that account is 5.5% per year.
 * How much would that user have in 5 years?
 */

class Exercise7{
    var p=0;
    var r=0.0f;
    var t=0;
    constructor(p:Int,r:Float,t:Int){
        this.p=p
        this.r=r
        this.t=t
    }

    fun getSimpleInterest():Float{
        return ((p*r*t)/100)
    }
}
