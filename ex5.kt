fun main(){
    ano()
}

fun ano(){
    println("Qual o ano?")
    var ano = readln().toInt()

    if (ano%4 == 0){
        println("O ano $ano é bissexto")
    }
    else{
        println("O ano $ano não é bissexto")
    }
}