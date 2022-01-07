fun main(args: Array<String>){

    var numeroBinario: Long = 1000000
    var numeroDecimal:Int = 0

    println("Método Principal")
    numeroDecimal = conversaoBinarioDecimal(numeroBinario)

    println("Número Binário $numeroBinario = $numeroDecimal")
}

fun conversaoBinarioDecimal(numeroBinario: Long): Int {

    var numeroBinario = numeroBinario
    var numeroDecimal = 0
    var i = 0
    var numeroTemporario: Long

    while(numeroBinario.toInt() != 0){

        numeroTemporario = numeroBinario % 10
        numeroBinario /= 10
        numeroDecimal +=   (numeroTemporario * Math.pow(2.0, i.toDouble())).toInt()
        ++i

    }

    return numeroDecimal
}