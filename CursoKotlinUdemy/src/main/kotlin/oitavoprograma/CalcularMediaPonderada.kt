/**
 * Este programa calcula a média ponderada
 * entre três valores
 *
 * nota1, nota2, nota3 (var)
 * peso1, peso2, peso3 (val)
 *
 * peso1 = 2
 * peso2 = 3
 * peso3 = 4
 *
 * mediaPonderada =
 *       ( (nota1*peso1) + (nota2*peso2) + (nota3*peso3) ) / (peso1+peso2+peso3)
 *
 */

fun main(){

    val peso1:Int = 2
    val peso2:Int = 3
    val peso3:Int = 4

    println("Digite a 1ª nota:")
    var nota1:Double  = readLine()!!.toDouble()

    println("Digite a 2ª nota:")
    var nota2:Double  = readLine()!!.toDouble()

    println("Digite a 3ª nota:")
    var nota3:Double  = readLine()!!.toDouble()

/*    var mediaPonderada =
        ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) /
                (peso1+peso2+peso3)*/

    var mediaPonderada = calcularMediaPonderada(nota1,nota2,nota3,peso1,peso2,peso3)

    mostrarResultado(mediaPonderada)


}

fun calcularMediaPonderada( nota1:Double,
                            nota2:Double,
                            nota3:Double,
                            peso1:Int,
                            peso2:Int,
                            peso3:Int): Double{

    var mediaPonderada = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) /
            (peso1+peso2+peso3)

    return  mediaPonderada
}


fun mostrarResultado(mediaPonderada:Double){

    return  println("Média Ponderada Calculada: $mediaPonderada")
}