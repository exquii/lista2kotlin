fun main(){
    numero()
}

fun numero(){
    println("Qual o número?")
    var num = readln().toInt()

    if (num%2 == 0){
        println("O número $num é par")
    }
    else{
        println("O número $num é ímpar")
    }
}