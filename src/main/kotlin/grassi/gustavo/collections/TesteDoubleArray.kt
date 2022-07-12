package grassi.gustavo.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1234.0
    salarios[1] = 3567.9
    salarios[2] = 4599.1

    salarios.forEach { println(it) }

    println("______________________________")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario + 1.1
    }
    salarios.forEach { println(it) }

    println("______________________________")
    val salarios2 = doubleArrayOf(1234.0, 3567.9, 4599.1)
    salarios2.sort()
    salarios2.forEach { println(it) }
}