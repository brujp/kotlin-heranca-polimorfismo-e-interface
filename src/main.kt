fun main() {
    println("Bem vindo ao Bytebank")

    val bruno = Funcionario(
        nome = "Bruno", cpf = "465.514.428-97", salario = 7000.0
    )

    println("Nome: ${bruno.nome}")
    println("CPF: ${bruno.cpf}")
    println("Salario: ${bruno.salario}")
    println("Bonificação: ${bruno.bonificacao()}")
}
