import enums.Activity
import enums.Level
import models.Content

/**
 * Retorna a lista de conteúdo do bootcamp Kotlin Experience.
 *
 * @return Retorna a lista de conteúdo.
 */
fun getBootcampKotlin(): List<Content> {
    return listOf(
        Content("Conheça as Oportunidades da DIO", Activity.COURSE, Level.BASIC, 1),
        Content("Seja Protagonista Neste model.Bootcamp", Activity.COURSE, Level.BASIC, 1),
        Content("Kotlin Experience | Activity.COURSE Inaugural", Activity.LIVE, Level.BASIC, 2),
        Content("Introdução ao Desenvolvimento Moderno de Software", Activity.COURSE, Level.BASIC, 2),
        Content("Trabalhando em Equipes Ágeis", Activity.COURSE, Level.BASIC, 3),
        Content("Introdução à Programação e Pensamento Computacional", Activity.COURSE, Level.BASIC, 5),
        Content("Como Entregar seu Activity.CODE de Activity.PROJECT", Activity.COURSE, Level.BASIC, 1),
        Content("Criando seu Primeiro Repositório no GitHub", Activity.PROJECT, Level.BASIC, 2),
        Content("Conhecendo o Kotlin e Sua Documentação Oficial", Activity.COURSE, Level.BASIC, 1),
        Content("Introdução à Linguagem de Programação Kotlin", Activity.COURSE, Level.BASIC, 2),
        Content("Estruturas de Controle de Fluxo e Coleções", Activity.COURSE, Level.BASIC, 2),
        Content("POO e Tipos de Classes na Prática com Kotlin", Activity.COURSE, Level.BASIC, 2),
        Content("O Poder das Funções em Kotlin", Activity.COURSE, Level.BASIC, 1),
        Content("Abstraindo Formações da DIO Usando POO com Kotlin", Activity.PROJECT, Level.BASIC, 2),
        Content("Suas Primeiras Condições em Kotlin", Activity.CODE, Level.BASIC, 1),
        Content("Avançando Tecnicamente Com a Expressão When", Activity.CODE, Level.BASIC, 1),
        Content("Explorando Mapas, Loops e Regras com Kotlin", Activity.CODE, Level.INTERMEDIARY, 1),
        Content("Utilizando a Keyword Object com POO", Activity.CODE, Level.ADVANCED, 1),
        Content("POO Visando Soluções Mais Idiomáticas", Activity.CODE, Level.ADVANCED, 1),
        Content("Deixando Seu LinkedIn Atrativo", Activity.COURSE, Level.BASIC, 2),
        Content("Turbine Seu Currículo na DIO", Activity.COURSE, Level.BASIC, 1),
        Content("Transformando seu Conhecimento em Artigos Técnicos", Activity.COURSE, Level.BASIC, 1),
        Content("Se Preparando Para Uma Entrevista", Activity.COURSE, Level.BASIC, 1),
    )
}

/**
 * Retorna a lista de conteúdo do bootcamp Philips Fullstack Developer.
 *
 * @return Retorna a lista de conteúdo.
 */
fun getBootcampPhillips(): List<Content> {
    return listOf(
        Content("Boas-vindas ao Bootcamp Philips Fullstack Developer", Activity.COURSE, Level.BASIC, 1),
        Content("Mentoria: Aula inaugural - Philips Fullstack Developer", Activity.LIVE, Level.BASIC, 2),
        Content("Lógica de programação essencial", Activity.COURSE, Level.BASIC, 4),
        Content("Pensamento computacional", Activity.COURSE, Level.BASIC, 2),
        Content("Introdução ao Git e ao Github.", Activity.COURSE, Level.BASIC, 5),
        Content("Criando seu primeiro repositório no Github", Activity.PROJECT, Level.BASIC, 6),
        Content("Introdução a criação de websites com HTML e CSS", Activity.COURSE, Level.BASIC, 6),
        Content("Construindo páginas para internet com Bootstrap", Activity.COURSE, Level.BASIC, 4),
        Content("Posicionando elementos com Flexbox em CSS", Activity.COURSE, Level.BASIC, 4),
        Content("Sintaxe básica em JavaScript", Activity.COURSE, Level.BASIC, 2),
        Content("Sintaxe e operadores", Activity.COURSE, Level.BASIC, 2),
        Content("Variáveis e tipos", Activity.COURSE, Level.BASIC, 3),
        Content("Trabalhando com módulos em JavaScript", Activity.COURSE, Level.BASIC, 1),
        Content("Funções", Activity.COURSE, Level.BASIC, 1),
        Content("Coleções", Activity.COURSE, Level.BASIC, 1),
        Content("Debugging e Error Handling", Activity.COURSE, Level.BASIC, 2),
        Content("Orientação a objeto", Activity.COURSE, Level.BASIC, 1),
        Content("Javascript Assíncrono", Activity.COURSE, Level.BASIC, 1),
        Content("Recriando o jogo do dinossauro sem internet", Activity.PROJECT, Level.INTERMEDIARY, 1),
        Content("Desafios de códigos iniciais Js - Philips Developer", Activity.CODE, Level.BASIC, 0),
        Content("Introdução ao TypeScript", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Introdução ao Angular 8", Activity.COURSE, Level.BASIC, 5),
        Content("Arquitetura e complexidade no front-end.", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Explorando diretivas com Angular", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Trabalhando com páginas SPA com Angular", Activity.COURSE, Level.ADVANCED, 2),
        Content("Serviços e injeção de dependências com Angular", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Introdução a serviços assíncronos no Angular", Activity.COURSE, Level.INTERMEDIARY, 3),
        Content("O poder do Data Binding no Angular", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Trabalhando com componentes em Angular", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Criação de pipes com Angular", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Desafios de códigos intermediário Js", Activity.CODE, Level.BASIC, 1),
        Content("Criar um front-end de e-commerce utilizando Angular", Activity.PROJECT, Level.BASIC, 1),
        Content("SQL SERVER - Criando sua primeiras consultas", Activity.COURSE, Level.BASIC, 4),
        Content("SQL SERVER - Modelando banco de dados com SQL SERVER", Activity.COURSE, Level.BASIC, 2),
        Content("SQL SERVER - Boas práticas em bancos relacionais", Activity.COURSE, Level.BASIC, 2),
        Content("Dominando IDEs Java", Activity.COURSE, Level.BASIC, 4),
        Content("Dominando IDEs Java", Activity.COURSE, Level.BASIC, 4),
        Content("Introdução ao ecossistema e documentação Java", Activity.COURSE, Level.BASIC, 2),
        Content("Configurando ambiente de desenvolvimento Java no Linux", Activity.COURSE, Level.BASIC, 1),
        Content("Resolvendo Activity.CODEs de código em Java", Activity.COURSE, Level.BASIC, 1),
        Content("Desafios de códigos iniciais Java - Philips Developer", Activity.CODE, Level.BASIC, 0),
        Content("Variáveis, tipos de dados e operadores matemáticos em Java", Activity.COURSE, Level.BASIC, 2),
        Content("Entendendo Métodos Java", Activity.COURSE, Level.BASIC, 2),
        Content("Lógica condicional e controle de fluxos em Java", Activity.COURSE, Level.BASIC, 1),
        Content("Estrutura de repetição e Arrays em Java", Activity.COURSE, Level.BASIC, 3),
        Content("Introdução a orientação a objeto com Java", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Criando um banco digital com Java e POO.", Activity.PROJECT, Level.INTERMEDIARY, 6),
        Content("Debugging Java", Activity.COURSE, Level.BASIC, 1),
        Content("Trabalhando com collections Java", Activity.COURSE, Level.INTERMEDIARY, 6),
        Content("Desafios de códigos intermediários Javar", Activity.CODE, Level.BASIC, 0),
        Content("Abstraindo um Bootcamp usando POO", Activity.PROJECT, Level.INTERMEDIARY, 1),
        Content("Introdução ao Spring Framework", Activity.COURSE, Level.BASIC, 3),
        Content("Introdução ao framework Spring Boot", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Simplificando projetos com o Spring Boot", Activity.COURSE, Level.BASIC, 3),
        Content("Imersão no Spring Framework com Spring Boot", Activity.COURSE, Level.BASIC, 3),
        Content("Introdução a orientação a objeto com Java", Activity.COURSE, Level.INTERMEDIARY, 2),
        )
}

/**
 * Retorna a lista de conteúdo do bootcamp Sportheca Mobile Developer.
 *
 * @return Retorna a lista de conteúdo.
 */
fun getBootcampSportheca(): List<Content> {
    return listOf(
        Content("Boas-Vindas ao Bootcamp - Sportheca Mobile Developer", Activity.COURSE, Level.BASIC, 1),
        Content("Mentoria: Sportheca Mobile Developer", Activity.LIVE, Level.BASIC, 2),
        Content("Pensamento computacional", Activity.COURSE, Level.BASIC, 2),
        Content("Introdução ao Git e ao Github", Activity.COURSE, Level.BASIC, 5),
        Content("Criando seu primeiro repositório no Github", Activity.PROJECT, Level.BASIC, 6),
        Content("Dominando IDEs Java", Activity.COURSE, Level.BASIC, 4),
        Content("Estrutura de dados em Java: Introdução", Activity.COURSE, Level.BASIC, 2),
        Content("Estrutura de dados em Java: Pilhas e filas", Activity.COURSE, Level.BASIC, 2),
        Content("Estrutura de dados em Java: Listas", Activity.COURSE, Level.BASIC, 3),
        Content("Estrutura de dados em Java: Árvores", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Estrutura de dados em Java: implementações", Activity.COURSE, Level.INTERMEDIARY, 1),
        Content("Introdução a orientação a objeto com Java", Activity.COURSE, Level.INTERMEDIARY, 2),
        Content("Criando um banco digital com Java e POO.", Activity.PROJECT, Level.INTERMEDIARY, 6),
        Content("Debugging Java", Activity.COURSE, Level.BASIC, 1),
        Content("Tratamento de Exceções em Java", Activity.COURSE, Level.BASIC, 2),
        Content("Trabalhando com collections Java", Activity.COURSE, Level.INTERMEDIARY, 6),
        Content("Activity.CODEs em Java - Sportheca", Activity.CODE, Level.BASIC, 0),
        Content("Abstraindo um Bootcamp usando POO", Activity.PROJECT, Level.INTERMEDIARY, 1),
        Content("SQL SERVER - Criando sua primeiras consultas", Activity.COURSE, Level.BASIC, 4),
        Content("SQL SERVER - Modelando banco de dados com SQL SERVER", Activity.COURSE, Level.BASIC, 2),
        Content("SQL SERVER - Boas práticas em bancos relacionais", Activity.COURSE, Level.BASIC, 2),
        Content("Desenvolvimento mobile nativo para Android", Activity.COURSE, Level.BASIC, 1),
        Content("Componentes, layouts e UI/UX em Apps Android", Activity.COURSE, Level.INTERMEDIARY, 3),
        Content("Java e Kotlin juntos? Construindo Apps Android", Activity.COURSE, Level.INTERMEDIARY, 3),
        Content("Explorando o firebase para Apps Android", Activity.COURSE, Level.ADVANCED, 2),
        Content("Introdução ao Kotlin", Activity.COURSE, Level.BASIC, 6),
        Content("Fundamentos de orientação a objeto com Kotlin", Activity.COURSE, Level.BASIC, 6),
        Content("Aplicando conceitos de coleções, Arrays e listas", Activity.COURSE, Level.BASIC, 5),
        Content("Android Studio e principais Ferramentas", Activity.COURSE, Level.BASIC, 3),
        Content("Projetando o primeiro App android usando Kotlin", Activity.COURSE, Level.BASIC, 3),
        Content("Debugging, tratamento de erros e exceções", Activity.COURSE, Level.BASIC, 4),
        Content("Utilizando recursos nativos do Android", Activity.COURSE, Level.ADVANCED, 6),
        Content("Desmistificando o Android Studio na prática", Activity.COURSE, Level.INTERMEDIARY, 1),
        Content("Criando um App de cartão de visitas em Kotlin", Activity.PROJECT, Level.INTERMEDIARY, 6),
        Content("Arquitetura da plataforma Android com Kotlin", Activity.COURSE, Level.BASIC, 3),
        Content("Arquitetura MVVM na prática", Activity.COURSE, Level.BASIC, 2),
        Content("Aplicando TDD e Testes no Android", Activity.COURSE, Level.INTERMEDIARY, 1),
        Content("Navegação, aparência e estilo com Android", Activity.COURSE, Level.INTERMEDIARY, 4),
        Content("Kotlin com Clean Architecture e MVVM", Activity.COURSE, Level.ADVANCED, 2),
        Content("Banco de dados SQLITE no Android", Activity.COURSE, Level.INTERMEDIARY, 7),
        Content("Activity.CODEs Sportheca", Activity.CODE, Level.BASIC, 0),
        Content("Criando seu primeiro repositório no GitHub", Activity.PROJECT, Level.BASIC, 1),
    )
}
