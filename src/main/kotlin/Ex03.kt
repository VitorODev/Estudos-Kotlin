fun main (){

    println("==========   BANCO XXX   ==========")
    println("INFORME SUA CONTA: ")
    val conta: Int = readLine()!!.toInt()
    println("INFORME SUA AGÊNCIA: ")
    val agencia: Int = readLine()!!.toInt()
    println("INFORME O VALOR DO SAQUE: ")
    val valorSaque: Int = readLine()!!.toInt()
    println("===================================")

    if (conta == 1356 && agencia == 10){
        var saldoConta: Int = 3072

        if (valorSaque > 0){

            if(valorSaque <= saldoConta){
                saldoConta- valorSaque
                println("SAQUE REALIZADO COM SUCESSO")
                println("RETIRE SUAS NOTAS")
                println("SALDO DA CONTA: " + (saldoConta-valorSaque))
                println("===================================")

            }else{
                println("SALDO DA CONTA INSUFICIENTE PARA SAQUE")
                println("===================================")
            }
        }else{
            println("VALOR DO DQUE DEVE SER MAIOR QUE R$ 10,00")
            println("===================================")
        }
    }else{
        println("AGENCIA OU CONTA NÂO EXISTE")
        println("===================================")
    }
}