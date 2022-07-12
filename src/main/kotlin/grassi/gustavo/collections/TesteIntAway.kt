package grassi.gustavo.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("________________________________")
    for (valor in values) {
        println(valor)
    }

    println("________________________________")
    values.forEach { valor ->
        println(valor)
    }

    println("________________________________")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}