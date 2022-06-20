/**
 * Create a function that takes a product name and price. It adds 20% tax to that product and displays a message saying how much the product costs.
 * Overload the function so that it takes a map of products and prices, and does the same thing.
 * Call both functions in your program.
 */
class Exercise28{
    fun cost(product:String,price:Double?): String {
        return "$product : ${price?.times(1.2)}"
    }

    fun cost(product: Map<String,Double>){
        for(p in product.keys)
            cost(p,product[p])
    }
}
fun main(args: Array<String>) {
    println( Exercise28().cost("tea",20.0))


}

