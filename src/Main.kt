import java.awt.Color
import kotlin.random.Random
fun main() {
    println("-----------------")
    for (Color in ColorType.values()){
        println("${Color.Color} - ${Color.Value}")
    }
    println("-----------------")
    for (Days in Day.values()){
        println("${Days.Days} - ${Days.Value}")
    }
    println("-----------------")
    ColorType.RED.ColorTXT()
    ColorType.BLUE.ColorTXT()
    ColorType.GREEN.ColorTXT()
    ColorType.YELLOW.ColorTXT()
    ColorType.BLACK.ColorTXT()
    println("-----------------")
    Day.MONDAY.ColorTXT()
    Day.TUESDAY.ColorTXT()
    Day.WEDNSDAY.ColorTXT()
    Day.THURSDAY.ColorTXT()
    Day.FRIDAY.ColorTXT()
    Day.SATURDAY.ColorTXT()
    Day.SUNDAY.ColorTXT()
    println("-----------------")
    ColorType.RED.Test()
    ColorType.RED.ipad()
    ColorType.RED.colori()
    Day.MONDAY.vihod()
    Day.MONDAY.Nextday()




}