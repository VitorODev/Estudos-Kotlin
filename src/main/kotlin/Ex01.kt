fun main(args: Array<String>) {
 // CALCULAR A COMISSAO DE UM FUNCIONÁRIO

    println("Qual o salario Bruto: ")
    val salBruto: Int = readLine()!!.toInt()

    println("Qual valor vendido no mês:")
    val vendas:Int = readLine()!!.toInt()

    if (vendas < 15000){
        val comissaoUm: Double = vendas * 0.12
        println("Comissão é $comissaoUm")
        print("Salário + Comissao :" +( salBruto + comissaoUm))

    } else if ( vendas >15000 && vendas < 26000 ){
        val comissaoDois: Double = vendas * 0.18
        println("Comissão é $comissaoDois")
        println("Salário + Comissao :"+ (salBruto * comissaoDois))

    } else if (vendas > 26000){
        val comisaoTres:Double = vendas * 0.24
        println("Comissão é $comisaoTres")
        println("Salário + comissao :"+ (salBruto * comisaoTres))
    }
}