package grassi.gustavo.collections

fun main() {
    val salarios = doubleArrayOf(1000.1, 2000.2, 3000.3)

    for (salario in salarios) {
        println(salario)
    }

    println("__________________________")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("__________________________")
    salarioMaiorQue2500.forEach { println(it) }

    println("__________________________")
    println(salarios.count { it in 1000.0..5000.9 })

    println("__________________________")
    println(salarios.find { it == 3000.3 })
    println(salarios.find { it == 3456.9 })

    println("__________________________")
    println(salarios.any { it == 10234.423 })
    println(salarios.any { it == 1000.1 })
}