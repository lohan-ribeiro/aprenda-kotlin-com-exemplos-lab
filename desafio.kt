// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var usuario: String){
    override fun toString():String {
        return "$usuario"
    }
}

data class ConteudoEducacional(var nome: String, var duracao: Int){
    override fun toString():String{
        return "$nome, Hrs:$duracao"
    }
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>,val nivel: Nivel) {
	override fun toString():String{
        return "Formação: $nome\nConteúdo educacional: $conteudos\nNível: $nivel \nAlunos:$inscritos"
    }
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
       inscritos.addAll(usuario)
    }
}

fun main() {
 
   	val lohan = Usuario("lohan")
    val joao = Usuario("joao")
     
   	val conteudoJava = ConteudoEducacional("java", 90)
   	val conteudoKotlin = ConteudoEducacional("kotlin", 40)
     
    val formacaoJava = Formacao("java Developer", listOf(conteudoJava), Nivel.BASICO)
    val formacaoKotlin = Formacao("Kotlin Developer", listOf(conteudoKotlin), Nivel.INTERMEDIARIO)
	
    formacaoJava.matricular(lohan)
    formacaoKotlin.matricular(lohan, joao)
    
    println(formacaoJava)
    println()
   	println(formacaoKotlin)
}
