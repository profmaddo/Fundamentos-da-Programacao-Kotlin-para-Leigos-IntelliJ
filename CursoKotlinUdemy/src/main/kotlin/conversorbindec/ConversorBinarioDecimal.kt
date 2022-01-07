fun main(args: Array<String>){

    var numeroBinario = "11111111"
    var numeroDecimal:Int = 0

    println("Método Principal")
    numeroDecimal = conversaoBinarioDecimal(numeroBinario)

    println("Número convertido: $numeroDecimal")
}

fun conversaoBinarioDecimal(numeroBinario:String):Int {

    println("Método de Conversão: $numeroBinario")

    return 255
}