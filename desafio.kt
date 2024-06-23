// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class LevelEnum { BASICO, INTERMEDIARIO, DIFICIL }

class User(val name: String, val matrícula: Int)

data class ConteudoEducacional(var name: String, val duracao: Int = 60)

data class Formacao(val name: String, var conteudos: List<ConteudoEducacional>, val level: LevelEnum) {

    val inscritos = mutableListOf<User>()
    
    fun matricular(usuario: User) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Usuário ${usuario.name} matrículado no formação $name.\n")
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val conteudo1 = ConteudoEducacional("Kotlin Básico")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos com Kotlin", 120)
    val conteudo3 = ConteudoEducacional("Desenvolvimento de Aplicações Web com Kotlin", 180)
    
	val conteudoFormacao1 = listOf(conteudo1)
	val conteudoFormacao2 = listOf(conteudo2, conteudo3)
    
    val user1 = User("Alice", 2024120456)
    val user2 = User("Bryan", 2024038123)
    
    val formacao1 = Formacao("Formação Kotlin developer", conteudoFormacao1, LevelEnum.BASICO)
    val formacao2 = Formacao("Formação Avançada Kotlin developer", conteudoFormacao2, LevelEnum.DIFICIL)
    
 
 	formacao1.matricular(user1)
 	formacao1.matricular(user2)
 	formacao2.matricular(user2)
 
 
    println("Informações das formações:")
    
    listOf(formacao1, formacao2).forEach { formacao ->
    	println("formaçao: ${formacao.name}, Nível: ${formacao.level}")
    	println("Conteúdos:")
        
    	formacao.conteudos.forEach{ c -> 
            println("- ${c.name} (Duração: ${c.duracao} minutos)")
        }
        
        println("Inscritos:")
        
        formacao.inscritos.forEach { i ->
            println("- ${i.name}")
        }
        println()
    }
    
}