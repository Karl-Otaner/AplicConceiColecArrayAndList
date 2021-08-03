package one.digitalinnovation.collections

fun main() {
    val nome = Array(3){""}
    nome[0] = "Maria"
    nome[1] = "Zazá"
    nome[2] = "José"

    for (nome in nome){
        println(nome)
    }

    println("================================")

    nome.sort()
    nome.forEach { println(it) }

    println("================================")
    val nome2 = arrayOf("Maria", "Zazá", "Pedro")
    nome2.sort()
    nome2.forEach { println(it) }
}