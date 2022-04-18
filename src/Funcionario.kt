open class Funcionario( //Open serve para que consigamos herdar a classe Funcionario em outra classe
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open fun bonificacao(): Double = salario * 0.1
}