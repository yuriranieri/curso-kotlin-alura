package execution

fun testeProcedural() {
    val titular = "Yuri cRanieri"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo $saldo")

    println(testaCondicoes(saldo))

    for (i in 1..6) {
        whenExpression(i)
    }

    for (i in 6 downTo 0 step 2) {
        println("i: $i")
    }
}

private fun whenExpression(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3 -> println("x == 3")
        4 -> println("x == 4")
        5 -> println("x == 5")
        else -> {
            println("x is not in 1, 2, 3, 4 , 5")
        }
    }
}