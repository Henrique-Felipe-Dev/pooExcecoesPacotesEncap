import bd.Banco
import seres.Animais
import seres.Pessoas

fun main(args: Array<String>) {

    /* Modificadores de Acesso

    default - Por padrão é o mesmo que o public
    private - Deixa nós acessarmos os atributos da classe apenas dentro da classe
    protected - Deixa nós acessarmos os atributos da classe dentro da classe e de sua
    subClasse
    public - Deixa nós acessarmos os atributos da classe em qualqeurt arquivo
    internal - Deixa nós acessarmos os atributos em qualquer arquivo do mesmo
    módulo
     */

    /*
    val leao = Animais()

    leao.nome = "Leão"
    leao.especie = "Branco"
    leao.carnivoro = true

    val henrique = Pessoas("Henrique", 21, 1.75)

    henrique.alterarNome("Henrique")
    henrique.mostrarNome()
     */

    /*
    try{
        tentar executar algo
    }catch(exceção){
        println("Opa, algo deu errado")
    }
     */
    /*
    try {
        var num = "askdlaskd".toInt()
    }catch (e: Exception){
        println("Algo deu errado")
    }

     */

    println("Olá mundo")
    /*
    try{
        verificaNum(1, 2)
        println("Olha só, deu certo!")
    }catch (e: Exception){
        println("Deu errado")
    }
     */

    val banco = Banco()

    print("Digite o usuário: ")
    val user = readLine()!!
    print("Digite a senha: ")
    val senha = readLine()!!

    try{
        banco.conexao(user, senha)
        print("Agora digite a consulta que vc deseja: ")
        val consulta = readLine()!!
        banco.consulta(consulta)
    }catch (e: Exception){
        println(e.message)
    }

}

fun verificaNum(num1: Int, num2:Int){
    if(num1 == num2){
        println("Os números são iguais!")
    }else{
        throw Exception("Os parâmetros estão incorretos!")
    }
}