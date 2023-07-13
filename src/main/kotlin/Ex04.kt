fun main(){

    var peso: Double = 00.0 ;
    var altura: Double = 0.0
    var imc: Double = 00.0 ;
    var menu:Int = 0;

    do {

        println(" ================================")
        println("         TABELA DO IMC           ")
        println(" ================================")
        println("       ESCOLHA UMA OPÇÃO         ")
        println("================================ ")
        println(" 1 - INFORMAR MEDIDAS            ")
        println(" 2 - SAIR                        ")
        println("=================================")
        menu = readLine()!!.toInt()

       when(menu){

            1->{
                println("=================================")
                println("NOS INFORME SUAS MEDIDAS         ")
                println("=================================")
                println("QUAL A SUA ALTURA ")
                altura = readLine()!!.toDouble()
                println("=================================")
                println("QUAL A SEU PESO ")
                peso = readLine()!!.toDouble()
                println("=================================")
                imc = peso / (altura * altura)

                if (imc <18.5){
                    println("ABAIXO DO PESO. SEU IMC: $imc")
                } else if ( imc < 18.5 || imc < 25.0){
                    println("PESO NORMAL. SEU IMC: $imc")
                } else if (imc < 25.0 || imc <30.0){
                    println("ACIMA DO PESO. SEU IMC: $imc")
                } else{
                    println("OBESIDADE. SEU IMC:  $imc")
                }
            }
       }

    } while (menu != 0)
    println("PROGRAMA ENCERRADO")
}