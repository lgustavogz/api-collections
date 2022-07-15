package grassi.gustavo.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "1000".toBigDecimal()
    )

    println("________________________")
    println(salarios.somatoria())

    println("________________________")
    println(salarios.media())
}