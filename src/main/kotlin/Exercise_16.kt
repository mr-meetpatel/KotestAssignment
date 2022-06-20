/**
 * You manage an amusement park, and you have a map that stores dates and attendance.
 * var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))
 * Add a value for 26 Sept.
 * How many people attended in total on 25 and 26 Sept?
 * Is data for 22 Sept available?
 */
class Exercise16{
    var att= hashMapOf(Pair("23 Sept",2837),Pair("24 Sept",3726),Pair("25 Sept",6253))
    constructor(){
        att["26 Sept"]=1000
    }
    fun totalAttendance(): Int {
        val n1=att["26 Sept"]?:0
        val n2=att["25 Sept"]?:0
        return n1+n2
    }
}
