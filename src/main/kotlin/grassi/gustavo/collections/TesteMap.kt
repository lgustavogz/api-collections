package grassi.gustavo.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Guztazar", 5555.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Hyuawn" to 98756.5,
        "Yqerty" to 44456.9
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")
    }
}