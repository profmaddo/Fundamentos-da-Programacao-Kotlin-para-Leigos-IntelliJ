fun main() {

    var anoDeNascimento = 1965
    var anoAtual = 2022

    var resultadoDoCalculo = calcularAnosDeVida(anoDeNascimento, anoAtual)

    imprimirResultados(anoDeNascimento,anoAtual, resultadoDoCalculo)

}

fun calcularAnosDeVida(anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento

    return anosDeVida
}

fun imprimirResultados(
    anoDeNascimento: Int,
    anoAtual: Int,
    resultadoDoCalculo: Int
) {

    print("Como calcular quantos anos de vida uma pessoa tem?\n\n")
    print("Ano de Nascimento: $anoDeNascimento\n")
    print("Ano Atual........: $anoAtual\n\n")
    print("Resultado........: $resultadoDoCalculo\n\n")
    print("Você tem $resultadoDoCalculo anos de vida")

}