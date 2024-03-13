import kotlin.random.Random
import java.net.InetAddress

enum class ColorType(val Color:String, val Value:Int) {
    RED("Красный", 1),
    BLUE("Синий", 2),
    GREEN("Зеленый", 3),
    YELLOW("Желтый", 4),
    BLACK("Черный", 5);

    fun ColorTXT() {
        val colorCode = when (this) {
            RED -> "\u001B[31m"
            BLUE -> "\u001B[34m"
            GREEN -> "\u001B[32m"
            YELLOW -> "\u001B[33m"
            BLACK -> "\u001B[30m"
        }
        println("$colorCode${this.Color}\u001B[0m")
    }

    fun Test() {

        val colors = listOf("Красный", "Синий", "Зеленый", "Желтый", "Черный")
        val randomColor = colors[Random.nextInt(colors.size)]

        println("Какие цвета надо смешать чтобы получить: $randomColor")
        var otv = readLine()!!.toString()
        if (randomColor == "Красный") {
            if (otv == "желтый и алый") {
                println("Вы правильно ответили поздравляем!")
            }
        } else if (randomColor == "Cиний") {
            if (otv == "фиолетовый и красный") {
                println("Вы правильно ответили поздравляем!")
            }
        }
        if (randomColor == "Зеленый"){
            if (otv == "cиний и берюзовый") {
                println("Вы правильно ответили поздравляем!")
            }
        }
        if (randomColor == "Желтый"){
            if (otv == "зеленый и оливковый") {
                println("Вы правильно ответили поздравляем!")
            }
        }
        if (randomColor == "Черный"){
            if (otv == "золотой желтый") {
                println("Вы правильно ответили поздравляем!")
            }
        }
    }
    fun ipad() {
        val ip = InetAddress.getLocalHost().hostAddress
        println("А я знаю твой ip $ip ")
    }
    fun colori(){
        println("Выбери один из цветов: красный, зеленый, синий")
        val color = readLine()
        val yourColor = when (color) {
            "красный" -> "Ты - страстный и эмоциональный человек"
            "зеленый" -> "Ты - спокойный и гармоничный человек"
            "синий" -> "Ты - уравновешенный и креативный человек"
            else -> "Такой цвет не в списке. Попробуй еще раз!"
        }
        println(yourColor)
    }
}






