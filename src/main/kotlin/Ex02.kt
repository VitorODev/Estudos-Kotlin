fun main(args: Array<String>){
    // Calcular  Polha de Pagamento

    println("Qual o seu salario:")
    val salario: Double = readLine()!!.toDouble()

    val valeTransp: Double = salario * 0.06
    val FGTS: Double = salario * 0.11
    val INSS: Double = salario * 0.08
    val salReceber: Double = salario - valeTransp - INSS - FGTS

    println("======== FOLHA DE PAGAMENTO ========")
    println("EMPRESA: XXXXXX VENDAS DE PEÇAS PARA TRATORES LTDA")
    println("CNPJ : XX-4X3-44X-00X01-X6")
    println("Funcionário: Vitor Vinicius dos Reis")
    println("====================================")
    println("Vale Transporte $valeTransp")
    println("FGTS $FGTS")
    println("INSS $INSS")
    println("Salario Líquido " + salReceber)
    println("===================================")

}