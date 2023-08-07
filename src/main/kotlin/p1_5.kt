import java.text.SimpleDateFormat
import java.util.*

object Month {
    @JvmStatic
    fun main(args: Array<String>) {

        val date = Date()

        val month = SimpleDateFormat("MMM")

        val currentMonth = month.format(date)
        println(currentMonth)
    }
}