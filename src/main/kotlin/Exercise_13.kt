/**
 * A zoo has a list of animals.
 * val animals = arrayListOf(“lion”, “zebra”, “chimp”, “elephant”)
 * A new panda bear cub has arrived.
 * Print out the new list of animals.
 * The lion has been sold to a different zoo.
 * Print out the new list of animals.
 * Does the zoo have both elephants and giraffe
 */
class Exercise13{
    var animalsAvailable= arrayListOf("lion","zebra","chimp","elephant")
    fun addAnimalToTheZoo(newAnimals:List<String>): String {
        animalsAvailable.addAll(newAnimals)
        return "Animal Added..."
    }
    fun SellLoinFromTheZoo(): String {
        animalsAvailable.remove("lion")
        return "Lion Removed..."
    }
    fun isAvailable(animalsList:List<String>):Boolean{

        return animalsAvailable.containsAll(animalsList)
    }
}

