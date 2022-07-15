package grassi.gustavo.collections

fun main() {
    val giasca = Funcionario("Giasca", 1000.1, "CLT")
    val yela = Funcionario("Yela", 1000.2, "CLT")
    val xirtun = Funcionario("Xirtun", 1000.3, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(giasca.nome, giasca)
    repositorio.create(yela.nome, yela)
    repositorio.create(xirtun.nome, xirtun)

    println(repositorio.findById(giasca.nome))

    println("_________________________________")
    repositorio.findAll().forEach { println(it) }

    println("_________________________________")
    repositorio.remove(yela.nome)
    repositorio.findAll().forEach { println(it) }
}