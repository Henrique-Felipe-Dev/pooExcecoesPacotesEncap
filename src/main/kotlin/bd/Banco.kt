package bd

class Banco {

    fun conexao(usuario: String, senha: String){
        if(senha == "GeekGamer459"){
            println("Conexão com o Banco foi um sucesso!")
        }else{
            throw Exception("A senha está incorreta")
        }
    }

    fun consulta(consultaDb: String){
        if(consultaDb != ""){
            println("Consulta realizada com sucesso!")
        }else{
            throw Exception("A query não pode ser vazia")
        }
    }

}