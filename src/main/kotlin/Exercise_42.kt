/**
 * A TV can provide programs from a certain channel.
 * It can also provide channel and subtitle information.
 * It can also provide programs that were shown at a certain time of the day.
 * Implement this in a program and call the various methods.
 */

class TeleVision{
    fun getChannelInfo(id:Int): String {
        return "This Channel in running on $id"
    }
    fun getChannelInfo(id:Int,subtitle:Boolean): String {
        var s="This Channel in running on $id and "
        if(subtitle)
            return s+"subtitle is On"
        else
            return s+"subtitle is Off"
    }
    fun getChannelInfo(id:Int,time:String): String {
        return "This Channel in running on $id and time : $time"
    }
}

