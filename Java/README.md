# Curso de Java Para Iniciantes

### _Curso em Vídeo_

Acesse o [Curso de Java Para Iniciantes](https://www.cursoemvideo.com/curso/java-basico/) na plataforma do Curso em Vídeo.

`/install`: contém os instaladores e pacotes neessários para se construir o ambiente de desenvolvimento planejado no curso.

_**Nota:** A instalação do JRE é opcional, já que o JDK contém o JRE. Em caso de algum erro, use as versões disponíveis para orreões ou atualizações_

## Instalação no Windows

- Para evitar erros de versões instale o JDK atual (versão deste diretório 15.0.2)
- Para evitar erros de versões instale o JRE atual (versão deste diretório 8u202)
- Instale primeiro a IDE NetBeans
- Após a instalação do NetBeans instale o Java FX Scenebuilder (versão deste diretório 2.0)

_Os instaladores são baixados diretamente do site oficial da Oracle e estão aqui apenas para praticidade do meu repositório._ Acesso o [site oficial](https://www.oracle.com/br/) e baixe suas versões.

## Instalação no Linux

A distribuição usada foi a Linux Ubuntu, logo as orientações serão para ela, adapte caso necessário para outras distribuições. Lembrando que o Ubuntu tem compatibilidade com arquivos `.deb` e usa o gerenciador `apt` para instalações.

- Para evitar erros de versões instale o JDK atual (versão deste diretório 15.0.2)
- Para evitar erros de versões instale o JRE atual (versão deste diretório "jdk-8u202-linux-x64")
`sudo tar -xvf jdk-8u202-linux-x64.tar.gz -C /usr/lib/jvm`
- Instale primeiro a IDE NetBeans
- Após a instalação do NetBeans instale o Java FX Scenebuilder (versão deste diretório 2.0)
- [Instale o NetBeans](https://snapcraft.io/install/netbeans/ubuntu) pelo snap ou pela Ubuntu Software
`sudo snap install netbeans --classic`
- Instale o Java FX Scenebuilder

_**NOTA:** Por questões de praticidade com o repositório, a documentação também está inserida no diretório de instalação._

Java FX - tem que ter o scanbuilder
`java -jar "<nomeArquivo.jar"`

## Codificação em Java

Orientações e estudo simples a respeito da linguagem Java para sobreviver e relembrar conceitos, além de sixtases e aplicações, servindo como uma espécie de "cola".

### Organização de Comentários

- Fazer uma observação simples no código

```java
// Comentários de 1 linha
```

- Deixar uma instrução ou orientação no código

```java
/*Comentários
 * de
 * múltiplas
 * linhas
*/
```

- Inserir informações de desenvolvimento do código

```java
/**
 * Exemplo de Documentação de Projeto
 * @author Identificação Autor
 * @version Versão do projeto (1.0)
 * @since Desde quando o projeto esta ativo/foi iniciado (yyy-mm-dd)
*/
```

- Informações ou observações entre blocos de comando

```java
/* Mais orientações em JAVA Docs - Pesquisar no buscador */
```

> **Nota:** Mais orientações em Java Docs - Pesquisar no buscador.

### Atribuição de Valores

Há basicamente 4 tipos utilizados pela linguagem Java para se atribuir valores. Cada um deles está descrito abixo, seguido de comentários informativos. Em seguida há também outras formas de se atribuir e declarar valores para estes 4 tipos.

```java
int valorA = 100; // Números Inteiros
float valorB = 100.0f; // Números Decimais - nas versões mais novas, colocar o f é opcional
char valorC = 'D'; // Apenas 1 caractere
boolean valorD = false; // Valores verdadeiros ou falsos
```

### Especificação de Tipos de Valores Específicos

Além das formas comuns de se declarar e atribuir variáveis, há também formas de delimitar como determinado valor será interpretado, idependente do que este valor represente inicialmente. Há também formas de classificar valores através de atribuições mais "complexas" inicialmente.

#### Atribuições no Formato Typecast

Declaração em Typecast considera o valor apresentado como o tipo especificado entre os parênteses.

```java
int valorA = (int) 3;
float valorB = (float) 100.0;
char valorC = (char) 'D';
boolean valorD = (boolean) false;
```

#### Atribuições no Formato Wrapper Class

Trata-se da atribuição de valores por classes, de forma interpretativa, a "variável se tornou um objeto". Estudar Wrapper(invólocro) Class.

```java
Integer valorA3 = new Integer(3);
Float valorB3 = new Float(100.0);
Character valorC3 = new Character('D');
Boolean valorD3 = new Boolean(false);
```

> **NOTA:** Não existe tipo **String** na linguagem Java, mas sim uma **Classe Envólocro**.

Os 4 tipos citados acima, em nível de contextualização são na verdade "famílias" para cada tipo suportado pela linguagem Java, então, sabendo os tipos existentes e (como utilizá-los de forma tradicional ou em Typecast) entendendo as Classes Invólocro será mais fácil entender a tabela a seguir, que descreverá a maioria do tipos importantes para se saber.

![Tabela](/img/Captura%20de%20Tela%20do%20Curso%20de%20Java%20Para%20Iniciantes%20do%20Curso%20em%20Vídeo.png "Captura de Tela do Curso de Java Para Iniciantes do Curso em Vídeo")

> **NOTA:** Em contexto hitórico, Java foi desenvolvido para rodar em qualquer lugar, *"Escreva uma vez, execute em qualquer lugar"*. Isto faz com que os diferentes tipos numéricos sejam para adaptações, onde buscar melhoria de memória é essencial.

## Saída de Dados

```java
System.out.print("");
System.out.println("");
```

```java

```