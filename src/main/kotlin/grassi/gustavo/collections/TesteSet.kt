package grassi.gustavo.collections

fun main() {
    val gusmer = Funcionario("Gusmer", 1000.1, "CLT")
    val yuna = Funcionario("Yuna", 1000.2, "CLT")
    val xerler = Funcionario("Xerler", 1000.3, "PJ")

    val funcionarios1 = setOf(gusmer, yuna)
    val funcionarios2 = setOf(xerler)

    val resultUnion = funcionarios2.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("___________________________________")
    val funcionarios3 = setOf(gusmer, yuna, xerler)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("___________________________________")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}

