package grassi.gustavo.collections

fun main() {
    val gusmer = Funcionario("Gusmer", 1000.1, "CLT")
    val yuna = Funcionario("Yuna", 1000.2, "CLT")
    val xerler = Funcionario("Xerler", 1000.3, "PJ")

    val funcionarios = listOf(gusmer, yuna, xerler)

    funcionarios.forEach { println(it)}

    println("_____________________________________")
    println(funcionarios.find { it.nome == "Gusmer" })

    println("_____________________________________")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it)}

    println("_____________________________________")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it)}

}
