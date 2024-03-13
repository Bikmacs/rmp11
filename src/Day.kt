enum class Day(val Days:String, var Value:Int) {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNSDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Субботу", 6),
    SUNDAY("Воскресенье", 7);

    fun vihod(): Boolean {
        return this == SATURDAY || this == SUNDAY
        println("Выходные: 1 - ${SATURDAY} 2 - ${SUNDAY}")
    }

    fun ColorTXT() {
        val colorCode = when (this) {
            MONDAY -> "\u001B[31m"
            TUESDAY -> "\u001B[34m"
            WEDNSDAY -> "\u001B[32m"
            THURSDAY -> "\u001B[33m"
            FRIDAY -> "\u001B[30m"
            SATURDAY -> "\u001B[37m"
            SUNDAY -> "\u001B[37m"
        }
        println("$colorCode${this.Days}\u001B[0m")
    }

    fun Nextday(): Day {
        return if (ordinal < values().size - 1) {
            entries[ordinal + 1]
        } else {
            entries[0]
        }
    }
}