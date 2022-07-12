package grassi.gustavo.collections

fun main() {
    val values = intArrayOf(11, 4, 25, 7, 111, 43)

    values.forEach {
        println(it)
    }

    println("____________________")
    values.sort()
    values.forEach {
        println(it)
    }
}
