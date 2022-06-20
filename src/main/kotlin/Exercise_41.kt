/**
 * A default oven has an average cooking speed, top temperature and function for cooking.
 * A Bosch oven has a higher cooking temperature.
 * A Roaster oven does not cook but roasts. The speed and temperature are average.
 * Implement this in a program and print out the various information for the objects.
 */

abstract class Oven{
    val cookingSpeed=90
    open val avgTemp=100
    abstract fun cooking():String
}

class Bosch:Oven() {
    override val avgTemp = 120
    override fun cooking(): String {
        return "Bosch Oven Cooking Speed : $cookingSpeed and AvgTemp : $avgTemp"
    }
}

class Roaster:Oven() {

    override fun cooking():String {
        return "Roaster Oven Cooking Speed : $cookingSpeed and AvgTemp : $avgTemp"
    }
}

