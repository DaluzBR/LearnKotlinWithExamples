package extensions

/**
 * Extensão para formatar a exibição das strings na tela.
 *
 * @param space Espaço a ser reservado para a exibição da string.
 */
fun String.lengthFormat(space: Int) = String.format("%-${space}s", this)

