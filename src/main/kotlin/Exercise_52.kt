/**
 * In order for an airplane to take off, it needs to have 2 engines, and they both need be running.
 * Create an Airplane class that has a takeoff method, which starts the engines and prints a take off message.
 */

class Aeroplan{
    val eng1=Engine("Engine1")
    val eng2=Engine("Engine2")
    val eng3=Engine("Engine3")

    fun takeOffPlane(): String {
        return eng1.startEngine()+"\n"+
        eng2.startEngine()+"\n"+
        eng3.startEngine()+"\n"+
         "takingOff Plane..."
    }

    fun landPlane(): String {
        return "landing plane...\n"+
        eng1.stopEngine()+"\n"+
        eng2.stopEngine()+"\n"+
        eng3.stopEngine()
    }
    inner class Engine(val name:String){
        fun startEngine(): String {
            return "Engine $name Started..."
        }
        fun stopEngine(): String {
            return "Engine $name Stop..."
        }
    }
}

