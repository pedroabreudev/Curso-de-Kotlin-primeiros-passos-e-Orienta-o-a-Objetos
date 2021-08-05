fun main() {
    println("Bem vindo ao Bytebank")
    val titular = "Pedro"
    val numeroConta = 1000
    var saldo = 0.0
//    saldo = 100 + 2.0
//    saldo += 200
//    saldo -= 10000


    println("Titular: $titular")
    println("Número da Conta: $numeroConta")
    println("Saldo da Conta: $saldo")

    when{
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}
