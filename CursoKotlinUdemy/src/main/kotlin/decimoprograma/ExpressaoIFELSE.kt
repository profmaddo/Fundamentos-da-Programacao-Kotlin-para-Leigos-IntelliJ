/**
 * Expressão IF ELSE
 */
fun main(){

    var valorA = 10
    var valorB = 20

    var i = null

    if (i == null) {

        executarProcessamento()

    } else {

        naoExecutarProcessamento()
    }

    print("\n\nFIM...")

}

fun executarProcessamento(){

    print("Processando....")
}

fun naoExecutarProcessamento(){

    print("Sem processamento...")
}