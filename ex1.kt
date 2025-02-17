fun main(){
    multa()
}

fun multa(){
    println("Qual a velocidade do veículo?")
    val a = readln().toInt()
    var multa = 0

    if (a > 80){
        multa = (a - 80) * 5
        println("Você foi multado em R$$multa")
    }
    else{
        println("Você está dentro da conformidade")
    }
}