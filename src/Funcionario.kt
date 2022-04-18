open class Funcionario( //Open serve para que consigamos herdar a classe Funcionario em outra classe
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonificacao: Double //Open possibilita override em outras classes
        get() {
            return salario * 0.1
        }

}