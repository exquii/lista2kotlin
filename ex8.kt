fun main(){
    preco()
}

fun preco(){
    println("Quantos Km você irá percorrer?")
    var distancia = readln().toFloat()

    if (distancia > 200 ){
        println("O preço da sua passagem é de R$${distancia * 0.45}")
    }
    else{
        println("O preço da sua passagem é de R$${distancia * 0.50}")
    }
}