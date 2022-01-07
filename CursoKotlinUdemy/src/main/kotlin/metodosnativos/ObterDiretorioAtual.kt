fun main(){

    println("Você está no diretório: ${getCaminhoAtual()}")

}

fun getCaminhoAtual():String {

    return System.getProperty("user.dir")
}