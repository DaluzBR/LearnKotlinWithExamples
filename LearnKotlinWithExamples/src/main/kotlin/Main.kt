import enums.Level
import extensions.lengthFormat
import models.Bootcamp
import models.User
import kotlin.random.Random

//TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

/**
 * Lista com os Bootcamps disponíveis.
 */
private val bootcampList = listOf(
    Bootcamp("Kotlin Experience", Level.BASIC, 40, getBootcampKotlin()),
    Bootcamp("Phillips Developer", Level.ADVANCED, 132, getBootcampPhillips()),
    Bootcamp("Sportheca Mobile Developer", Level.INTERMEDIARY, 125, getBootcampSportheca()),
)

fun main() {

    var escape = true
    var option: Int

    // Pré vários usuários de uma vez no bootcamp Kotlin Experience.
    val userKotlin1 = User(userIdGenerator(), "José Ferreira", "Kotlin Experience", getBootcampKotlin())
    val userKotlin2 = User(userIdGenerator(), "Ana Flores", "Kotlin Experience", getBootcampKotlin())
    val userKotlin3 = User(userIdGenerator(), "Maria Neves", "Kotlin Experience", getBootcampKotlin())
    val userKotlin4 = User(userIdGenerator(), "Lírio da Costa", "Kotlin Experience", getBootcampKotlin())
    val userKotlin5 = User(userIdGenerator(), "Otávio Meira", "Kotlin Experience", getBootcampKotlin())
    val userKotlin6 = User(userIdGenerator(), "Vera Lúcia", "Kotlin Experience", getBootcampKotlin())
    val userKotlin7 = User(userIdGenerator(), "Inteligente Sabido", "Kotlin Experience", getBootcampKotlin())
    userKotlin7.bootcampContent.forEach { it.isFinished = true }
    val bootcampKotlin = bootcampList[0]
    bootcampKotlin.register(userKotlin1, userKotlin2, userKotlin3, userKotlin4, userKotlin5, userKotlin6, userKotlin7)

    // Pré vários usuários de uma vez no bootcamp Phillips Developer.
    val userPhillips1 = User(userIdGenerator(), "Eder Anunciação", "Phillips Developer", getBootcampPhillips())
    val userPhillips2 = User(userIdGenerator(), "Paula Andrade", "Phillips Developer", getBootcampPhillips())
    val userPhillips3 = User(userIdGenerator(), "Ari Fontes", "Phillips Developer", getBootcampPhillips())

    userPhillips2.bootcampContent.forEach { it.isFinished = true }
    val bootcampPhillips = bootcampList[1]
    bootcampPhillips.register(userPhillips1, userPhillips2, userPhillips3)

    // Pré vários usuários de uma vez no bootcamp Phillips Developer.
    val userSportheca1 = User(userIdGenerator(), "Valdo Zoeiras", "Sportheca Mobile Developer", getBootcampSportheca())
    val userSportheca2 =
        User(userIdGenerator(), "Jacinto Fernandes", "Sportheca Mobile Developer", getBootcampSportheca())
    val userSportheca3 =
        User(userIdGenerator(), "Felisberto Torres", "Sportheca Mobile Developer", getBootcampSportheca())

    userSportheca1.bootcampContent.forEach { it.isFinished = true }
    val bootcampSportheca = bootcampList[2]
    bootcampSportheca.register(userSportheca1, userSportheca2, userSportheca3)

    do {
        println()
        println("+------------------------------------------------------------------------+")
        println("| @DaluzBR - ABSTRAINDO FORMAÇÕES DA DIO USANDO POO COM KOTLIN           |")
        println("+------------------------------------------------------------------------+")
        println("| [1] Lista de Bootcamps                                                 |")
        println("| [0] Sair                                                               |")
        println("+------------------------------------------------------------------------+")
        println()
        print("--> Escolha uma opção: ")
        option = getInput()

        when (option) {
            0 -> {
                println()
                print(" Bye bye ")
                escape = false
            }

            1 -> showBootcampList()
        }
    } while (escape)
}

/**
 * Ler e trata os valores de seleção dos menus.
 */
fun getInput(): Int {
    return try {
        readLine()?.toInt() ?: -1
    } catch (e: NumberFormatException) {
        -1
    }
}

/**
 * Mostra a lista dos bootcamps disponíveis.
 */
fun showBootcampList() {

    var escape = true
    var option: Int

    do {
        println()
        println("+------------------------------------------------------------------------+")
        println("| LISTA DE BOOTCAMPS                                                     |")
        println("+------------------------------------------------------------------------+")
        println("| [1] Ver o bootcamp Kotlin Experience                                   |")
        println("| [2] Ver o bootcamp Phillips Developer                                  |")
        println("| [3] Ver o bootcamp Sportheca Mobile Developer                          |")
        println("| [0] Sair                                                               |")
        println("+------------------------------------------------------------------------+")
        println()
        print("--> Escolha uma opção: ")
        option = getInput()

        when (option) {
            0 -> escape = false
            1 -> showBootcamp(bootcampList[0])
            2 -> showBootcamp(bootcampList[1])
            3 -> showBootcamp(bootcampList[2])
        }
    } while (escape)
}

/**
 * Mostra as informações do bootcamp escolhido.
 */
fun showBootcamp(bootcamp: Bootcamp) {

    var escape = true
    var option: Int

    do {
        println()
        println("+------------------------------------------------------------------------+")
        println("| ${bootcamp.name.uppercase()}                                            ")
        println("| Nível: ${bootcamp.level.level}     Duração: ${bootcamp.duration} hrs    ")
        println("| ${bootcamp.getUserSize()} devs já se inscreveram                        ")
        println("+------------------------------------------------------------------------+")
        println("| Lista de cursos                                                        |")
        println("+------------------------------------------------------------------------+")
        bootcamp.content.forEach {
            println(
                "| Curso: ${it.name.lengthFormat(60)}  Atividade: ${it.activity.activity.lengthFormat(20)}  Nível: ${
                    it.level.level.lengthFormat(
                        15
                    )
                }  Duração: ${it.duration}  hrs"
            )
        }
        println("+------------------------------------------------------------------------+")
        println("| [1] Entrar neste bootcamp                                              |")
        println("| [2] Ver usuários registrados                                           |")
        println("| [0] Sair                                                               |")
        println("+------------------------------------------------------------------------+")
        println()
        print("--> Escolha uma opção: ")
        option = getInput()

        when (option) {
            0 -> escape = false
            1 -> subscribeUser(bootcamp)
            2 -> showRegisteredUsers(bootcamp)
        }
    } while (escape)
}

/**
 * Função para registrar um novo usuário em um bootcamp.
 * TODO: Não verifica se o usuário já está inscrito em outro bootcamp.
 */
fun subscribeUser(bootcamp: Bootcamp) {
    println()
    println("+------------------------------------------------------------------------+")
    println("| REGISTRO DE USUÁRIO                                                    |")
    println("+------------------------------------------------------------------------+")
    println()
    print("--> Digite o nome do usuário: ")
    val userName: String? = readLine()

    userName?.let {
        val user = User(userIdGenerator(), userName, bootcamp.name, bootcamp.content)
        bootcamp.register(user)

        println("+------------------------------------------------------------------------+")
        println("| Parabéns, $userName.                                                    ")
        println("| Você está registrado no Bootcamp ${bootcamp.name}.                      ")
        println("+------------------------------------------------------------------------+")
        println("| Pressione [ENTER] para continuar.                                      |")
        println("+------------------------------------------------------------------------+")
        println()
        readLine()
        return
    }

    println("+------------------------------------------------------------------------+")
    println("| Erro: Sinto muito, seu registro não foi concluído.                     |")
    println("+------------------------------------------------------------------------+")
}

/**
 * Mostra as informações do bootcamp escolhido.
 */
fun showRegisteredUsers(bootcamp: Bootcamp) {

    val userList = bootcamp.getRegisteredUsers()

    println()
    println("+------------------------------------------------------------------------+")
    println("| ${bootcamp.name.uppercase()}                                            ")
    println("| Nível: ${bootcamp.level.level}     Duração: ${bootcamp.duration} hrs    ")
    println("+------------------------------------------------------------------------+")
    println("| Usuários registrados                                                   |")
    println("+------------------------------------------------------------------------+")
    userList.forEach {
        println("| ${it.name.lengthFormat(30)}   Concluído: ${it.isBootcampFinished()}")
    }
    println("+------------------------------------------------------------------------+")
    println("| Pressione [ENTER] para continuar.                                      |")
    println("+------------------------------------------------------------------------+")
    println()
    readLine()
}

/**
 * Soma a quantidade de todos os usuários inseridos em todos os bootcamps e soma 1 para gerar um
 * pseudo "id" de usuário único.
 */
fun userIdGenerator() = Random.nextInt(999999999)




