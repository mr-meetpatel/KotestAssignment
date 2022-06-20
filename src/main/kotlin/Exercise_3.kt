package Udemy

import javax.print.attribute.standard.PrintQuality

/**
 * A client has purchased a number of products that have a certain price
 * Print out the total amount that the client needs to pay
 * client name : mary
 * product quantity : 3
 * per product price :30
 */
class Exercise3{
    var clientName = ""
    var productQuantity=0
    var productPrice=0
    fun setData(clientName:String,productQuality: Int,productPrice: Int){
        this.clientName=clientName
        this.productPrice=productPrice
        this.productQuantity=productQuantity
    }
    fun getData():String{
        return  "Hello $clientName you need pay ${productQuantity * productPrice}"
    }
}
