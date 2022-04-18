open class Funcionario( //Open serve para que consigamos herdar a classe Funcionario em outra classe
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    fun bonificacao(): Double {
        return salario * 0.1
    }

}