package enums

/**
 * Nível de dificuldade das atividades e bootcamps.
 *
 * @param level Nível de dificuldade.
 */
enum class Level(val level: String) {
    BASIC("Básico"),
    INTERMEDIARY("Intermediário"),
    ADVANCED("Avançado")
}