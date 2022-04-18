fun testaFuncionarios() {
    val bruno = Funcionario(
        nome = "Bruno", cpf = "465.514.428-97", salario = 7000.0
    )

    println("Nome: ${bruno.nome}")
    println("CPF: ${bruno.cpf}")
    println("Salario: ${bruno.salario}")
    println("Bonificação: ${bruno.bonificacao()}")

    println("================================================")

    val claudemir = Gerente(
        nome = "Claudemir",
        cpf = "151.578.878.97",
        salario = 9000.0,
        senha = 1234
    )

    println("Nome: ${claudemir.nome}")
    println("CPF: ${claudemir.cpf}")
    println("Salario: ${claudemir.salario}")
    println("Bonificação: ${claudemir.bonificacao()}")

    if (claudemir.autentica(1234)) {
        println("Usuário autorizado")
    } else {
        println("Usuário não autorizado")
    }

    println("================================================")

    val gui = Diretor(
        nome = "Guilherme",
        cpf = "151.743.434.56",
        salario = 12000.0,
        senha = 7878,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("PLR: ${gui.plr}")
    println("Bonificação: ${gui.bonificacao()}")

    if (gui.autentica(7878)) {
        println("Usuário autorizado")
    } else {
        println("Usuário não autorizado")
    }

    println("================================================")

    val maria = Analista(
        nome = "Maria",
        salario = 6000.0,
        cpf = "157.878.878-56"
    )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salario: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao()}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(bruno)
    calculadora.registra(claudemir)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("================================================")

    println("Total de bonificação: ${calculadora.total}")
}