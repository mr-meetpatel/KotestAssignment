/**
 * Create a calculator class. It should have
 * A variable that stores the total.
 * A function that adds a number to the total.
 * A function that subtracts a number from the total.
 * A function that multiplies the total by an amount.
 * A function that divides the total by an amount.
 * A function that resets the total to 0.
 * Create an object, test out the functions and print out some results.
 */

class Calulator{
    var total=0
    fun add(add:Int) : Int{
        //print("After Adding $add to $total : ")
        total+=add
        return total
//        println("$total")
    }

    fun sub(sub:Int) : Int{
//        print("After Subtracting $sub from $total : ")
        total-=sub
        return total
//        println("$total")
    }

    fun mul(mul:Int):Int{
//        print("After Multiplying $mul to $total : ")
        total*=mul
        return total
//        println("$total")
    }

    fun div(div:Int):Int{
//        print("After Dividing $div to $total : ")
        total/=div
        return total
//        println("$total")
    }

    fun reset(): Int {
        total=0
        return total
//        println("total : $total")
    }
}


