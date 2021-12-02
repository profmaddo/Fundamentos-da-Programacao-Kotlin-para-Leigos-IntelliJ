/**
 * Expressão IF
 */
fun main(){

    var valorA = 10
    var valorB = 20

    var i = 23

    // Dicas para escrever IF

    if ((i == null) || (valorA <=8)) {

        processar()
    }

    if ((i != null) && (valorB > valorA)) {

        naoProcessar()
    }

    print("\nFim...")

}

fun processar(){
    print("\n\nTRUE")
}

fun naoProcessar(){
    print("\n\nFALSE")
}