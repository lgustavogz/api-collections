package grassi.gustavo.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Gustavo"
    nomes[2] = "Abner"

    for (nome in nomes) {
        println(nome)
    }

    println("__________________________")
    nomes.sort()
    nomes.forEach { println(it) }

    println("__________________________")
    val nomes2 = arrayOf("Maria", "Abner", "Gustavo")
    nomes2.sort()
    nomes2.forEach { println(it) }

}
