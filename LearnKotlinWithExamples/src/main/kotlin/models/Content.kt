package models

import enums.Activity
import enums.Level

/**
 *  Conteúdo Educacional
 *
 *  @param name Nome do conteúdo educacional.
 *  @param activity Classificação das atividades do conteúdo educacional.
 *  @param level Nível de dificuldade do conteúdo educacional.
 *  @param duration Tempo de duração em horas do conteúdo educacional.
 *  @param isFinished Estado da conclusão do conteúdo educacional.
 */
data class Content(
    val name: String,
    val activity: Activity,
    val level: Level,
    val duration: Int,
    var isFinished: Boolean = false
)
