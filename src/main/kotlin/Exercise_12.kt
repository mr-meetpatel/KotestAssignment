/**
 * You have a number of items on your desk.
 * val items = arrayListOf(“laptop”, “mouse”, “pen”, “paper”, “mug”, “phone”)
 * You clean up your desk and remove as many items as you can to be more productive.
 * val removedItems = listOf(“pen”, “paper”, “mug”, “phone”)
 * Print out the remaining items.
 */
class Exercise12{
    fun removeItemFromTheList(itemsList: ArrayList<String>,removeItemsList:List<String>):String{
        itemsList.removeAll(removeItemsList)
        return itemsList.toString()

    }
}
fun main(args: Array<String>) {
    var itemsList= arrayListOf("laptop", "mouse")
    var removeItemsList= listOf("laptop")


    println(Exercise12().removeItemFromTheList(itemsList, removeItemsList))

}
