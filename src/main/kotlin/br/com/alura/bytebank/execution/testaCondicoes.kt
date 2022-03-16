package br.com.alura.bytebank.execution

fun testaCondicoes(saldo: Double): String {
    val text = if (saldo > 0.0) {
        println("conta positiva")
        "saldo positivo"
    } else if (saldo == 0.0) {
        println("conta zerada")
        "saldo zerado"
    } else {
        println("conta negativa")
        "saldo negativo"
    }
    return text
}