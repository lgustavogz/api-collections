package grassi.gustavo.collections

fun main() {
    val salarios = doubleArrayOf(1000.1, 2000.2, 3000.3)

    for (salario in salarios) {
        println(salario)
    }

    println("__________________________")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("__________________________")
    salarioMaiorQue2500.forEach { println(it) }
}