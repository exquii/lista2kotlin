fun main() {
    triangulo()
}
fun triangulo () {
    println("Digite um segmento de uma reta: ")
    val segmento1 = readln().toInt()

    println("Digite um segmento de uma reta: ")
    val segmento2 = readln().toInt()

    println("Digite um segmento de uma reta: ")
    val segmento3 = readln().toInt()

    if (segmento1 < (segmento2 + segmento3) && segmento2 < segmento1 + segmento3 && segmento3 < (segmento1 + segmento2)) {
        println("É possível formar um triângulo com esses valores $segmento1, $segmento2, $segmento3")
    }
    else {
        println("NÃO é possível formar um triângulo com esses valores $segmento1, $segmento2, $segmento3")

    }
}