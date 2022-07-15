package grassi.gustavo.collections

fun main() {
    val gusmer = Funcionario("Gusmer", 1000.1, "CLT")
    val yuna = Funcionario("Yuna", 1000.2, "CLT")
    val xerler = Funcionario("Xerler", 1000.3, "PJ")

    println("_____________LIST_______________")
    val funcionarios = mutableListOf(yuna, xerler)
    funcionarios.forEach { println(it) }

    println("________________________________")
    funcionarios.add(gusmer)
    funcionarios.forEach { println(it) }

    println("________________________________")
    funcionarios.remove(yuna)
    funcionarios.forEach { println(it) }

    println("_____________SET______________")
    val funcionarioSet = mutableSetOf(yuna)
    funcionarioSet.forEach { println(it) }

    println("________________________________")
    funcionarioSet.add(gusmer)
    funcionarioSet.add (yuna)
    funcionarioSet.forEach { println(it) }
}