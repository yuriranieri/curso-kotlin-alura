package execution

import entity.Pessoa

fun testaCopiaReferencia() {
    var yuri = Pessoa("Yuri", 20)
    var yuri2 = Pessoa("Yuri", 20)
    var ygor = Pessoa("Ygor", 18)
    var ygor2 = Pessoa(idade = 18, nome = "Ygor")
    var teste = yuri

    if (yuri == yuri2) { // de acordo com metodo equals()
        println("objetos com mesmos valores")
    }

    if (yuri === teste) { // ve a referencia do objeto
        println("objetos com a mesma referencia na memoria")
    }

    println("Yuri: $yuri")
    println("Ygor: $ygor")
    println("Teste:  $teste \n")

    yuri.nome = "Tchury"
    yuri.idade = 21

    println("Yuri: $yuri")
    println("Ygor: $ygor")
    println("Teste:  $teste \n")

    teste.nome = "teste"
    teste.idade = 20

    println("Yuri: $yuri")
    println("Ygor: $ygor")
    println("Teste:  $teste \n")
}