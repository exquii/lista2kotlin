fun main(){
    desconto()
}

fun desconto(){
    println("Qual o seu nome?")
    val nome = readln()

    println("Qual o seu sexo?")
    val sexo = readln().lowercase()

    println("Valor das compras?")
    val compras = readln().toFloat()

    if (sexo == "feminino"){
        val desconto = 0.13 * compras
        println("Olá $nome, sua compra com desconto deu o total de R$${compras - desconto}")
    }
    else{
        val desconto = 0.05 * compras
        println("Olá $nome, sua compra com desconto deu o total de R$${compras - desconto}")
    }
}