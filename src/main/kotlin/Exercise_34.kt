/**
 * A class Job has three variables, name, revenue and salary, and two methods,
 * work - which increases revenue by the amount in salary
 * study - which increases salary
 * Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.
 * Create objects and call the functions a few times, printing out messages to see the result of the functions.
 */

open class Job{
    open var jobName=""
    open var revenue=0
    open var salary=0

    fun work(): Int {
        revenue+=salary
        return revenue
//        println("Revenue for $jobName is $revenue")
    }

    fun study(by:Int): Int {
        salary+=by
        return salary
    }
}

class Engineer:Job(){
    override var jobName="Engineer"


}

class Doctor:Job(){
    override var jobName="Doctor"
}

