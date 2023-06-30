import data.Usuario




fun main() {
    val userList = mutableListOf<Usuario>()
    while (true){
        println("====Sistema de Cadastro====")
        println("1.Cadastrar novo usuário")
        println("2.Visualizar usuário cadastrados")
        println("3. Sair")
        print("Digite a opção desejada:")


        when(readLine()){
            "1" -> cadastrarUsuario(userList)
            "2" -> exibirUsuarioCadastrado(userList)
            "3" -> {
                println("Saindo do sistema....")
                return
            }

            else -> println("Opção invalida. Tente novamente.")



        }
        println()

    }

}
fun cadastrarUsuario(userList: MutableList<Usuario>) {
println("==== Cadastro de Usuário ====")
    print("Digite o nome do usuario:")
    val name = readLine()?: return

    print("Digite o email do usuario:")

    val email = readLine() ?: return

    val user = Usuario(name,email)
    userList.add(user)

    println("Cadastrado com Sucesso!")


}
fun exibirUsuarioCadastrado(userList: MutableList<Usuario>) {
    println("==== Usuario Cadastrado ====")
    if (userList.isEmpty()){
        println("Nenhum usuario castrado.")

    } else{
        for (user in userList){

            println("Nome: ${user.name}")
            println("E-mail: ${user.email}")
            println("____________________")
        }
    }

}