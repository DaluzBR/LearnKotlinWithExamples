package models

/**
 * Classe que representa um usuário (Dev).
 */
data class User(
    val id: Int,
    val name: String,
    val bootcampName: String,
    val bootcampContent: List<Content>
) {

    /**
     * Verifica se todas as atividades foram realizadas.
     *
     * @return Retorna true se o bootcamp foi concluído, e false caso contrário.
     */
    fun isBootcampFinished() = !bootcampContent.any { !it.isFinished }

}


