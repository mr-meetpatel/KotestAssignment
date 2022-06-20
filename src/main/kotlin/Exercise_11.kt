/**
 * A customer will tell the program what product they want to buy.
 * Then, they will tell the program how many products they require.
 * Assume the price of the product is 9.99
 * What is the total?
 * Handle any exceptions that might occur.
 */
class Exercise11{
    fun genrateBill(productName:String,productQuantity:String):String{
        try{

            return "$productName : ${productQuantity.toInt().times(9.99)}"
        }catch (e:Exception){
            return "Exception Occur"
        }
    }
}
