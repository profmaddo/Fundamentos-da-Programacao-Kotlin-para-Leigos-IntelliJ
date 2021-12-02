/**
 * Soma de dois números inteiros
 */
fun main(){

    val primeiroNumero = 10 // Entrada de dados
    val segundoNumero:Int = 10 // Aplicativo Android

   // var soma = primeiroNumero + segundoNumero
    var soma = somarDoisNumero(primeiroNumero , segundoNumero)

    imprimirSoma(primeiroNumero, segundoNumero, soma)

    imprimirSoma(25,20,
        somarDoisNumero(25,20))

}

private fun imprimirSoma(primeiroNumero: Int, segundoNumero: Int, soma: Int) {
    println("1º número: $primeiroNumero")
    println("2º número: $segundoNumero")
    println("Soma: $soma")
}

fun somarDoisNumero(primeiroNumero:Int, segundoNumero:Int):Int {

    return primeiroNumero + segundoNumero
}