package enums

/**
 * Atividade é a modalidade do conteúdo apresentado.
 *
 * @param activity Modalidade de conteúdo.
 */
enum class Activity(val activity: String) {
    COURSE("Curso"),
    LIVE("Live"),
    PROJECT("Desafio de projeto"),
    CODE("Desafio de código"),
}