fun main(){
    alistamento()
}

fun alistamento(){
    println("Em que ano você nasceu?")
    var ano = readln().toInt()

    var idade = 2025 - ano

    if (idade < 18){
        print("Faltam ${18 - idade} anos para seu alistamento.")
    }
    else{
        print("Já se passaram ${idade - 18} anos do seu alistamento")
    }
}