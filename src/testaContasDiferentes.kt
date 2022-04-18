fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Bruninho",
        numero = 15452
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Bruninho 2",
        numero = 58687
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente após saque: ${contaCorrente.saldo}")
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)
    println("Saldo corrente após transferência: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo poupança após transferência: ${contaPoupanca.saldo}")
}