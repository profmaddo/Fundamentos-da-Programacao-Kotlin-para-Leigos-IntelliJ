/**
 * Calcular a área do triângulo
 * Área = (base * altura) / 2
 *
 */

fun main(){

    println("Cálculo da Área do Triângulo")

    println("Informa a medida da Base: ")
    var base:Int = readLine()!!.toInt()

    println("Informa a medida da altura: ")
    var altura:Int = readLine()!!.toInt()

  //  var areaDoTriangulo = (base * altura) / 2
    var areaDoTriangulo = calcularAreaDoTriangulo(base, altura)

    println("A área = $areaDoTriangulo")
    println("A área = ${calcularAreaDoTriangulo(5,4)}")


}

fun calcularAreaDoTriangulo(base:Int, altura:Int):Int {

    return (base * altura) / 2
}