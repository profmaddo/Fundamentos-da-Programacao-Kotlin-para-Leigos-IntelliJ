import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

    val dataHoraAtual = getDataHoraAtualFormatada()

    println("A data e hora atual é: $dataHoraAtual")

}

fun getDataHoraAtualFormatada():String{

    val dataHoraAtual = LocalDateTime.now()

    val dataFormatada = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss")

    val saidaFormada = dataHoraAtual.format(dataFormatada)


    return  saidaFormada.toString()
}