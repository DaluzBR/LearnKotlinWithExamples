package models

import enums.Level

/**
 *  Bootcamp
 *
 * @param name Nome do bootcamp.
 * @param level Nível de dificuldade do bootcamp.
 * @param duration Tempo de duração do bootcamp em horas.
 * @param content Lista com todas as informações dos conteúdos de um bootcamp.
 */
data class Bootcamp(
    val name: String,
    val level: Level,
    val duration: Int,
    val content: List<Content>
) {

    // Lista de usuários registrados.
    private val userRegisterList = mutableListOf<User>()

    /**
     * Registra usuários no bootcamp.
     * TODO: Não verifica se o usuário já está cadastrado.
     * @param users Lista variável de usuários a serem registrados.
     */
    fun register(vararg users: User) {
        userRegisterList.addAll(users)
    }

    /**
     * Retira usuários no bootcamp.
     *
     * @param users Lista variável de usuários a serem retirados.
     */
    fun unregister(vararg users: User) {
        userRegisterList.removeAll(users.toSet())
    }

    /**
     * Lista de usuários registrados no bootcamp.
     *
     * @return Retorna a lista de usuários no bootcamp.
     */
    fun getRegisteredUsers() = userRegisterList.toList()

    /**
     * Quantidade de usuários na lista.
     *
     * @return Retorna o número de usuários no bootcamp.
     */
    fun getUserSize() = userRegisterList.size

}