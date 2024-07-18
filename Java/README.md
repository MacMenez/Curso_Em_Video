# Curso de Java

## Curso de Java Para Iniciantes - Curso em Vídeo

🌐 Acesse o [Curso de Java Básico](https://www.cursoemvideo.com/curso/java-basico/) na plataforma do [Curso em Vídeo](https://www.cursoemvideo.com/).

### 🗃️ Repositório do Curso de Java

📦 `/install`: contém os instaladores e pacotes neessários para se construir o ambiente de desenvolvimento planejado no curso. Colocados aqui por questões de praticidade. **A recomendação é verificar os sites oficiais de distribuição**.

🖼️ `/img`: contém imagens para representações visuais em determinados momentos que se julgar necessário.

> 📌 _**Nota:** A instalação do JRE é necessária, mesmo o JDK contendo o JRE, pois em caso de algum erro, instalar as versões atualizadas (tanto da JRE quanto JDK) disponíveis auxiliam em correções ou atualizações_.

## 🖥️ Instalação no Windows

- Para evitar erros de versões instale o JDK atual (versão deste diretório [15.0.2](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html?_ga=2.170466789.497302932.1720933982-1868601546.1720657917))

- Para evitar erros de versões instale o JRE atual (versão deste diretório [8u202](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html?_ga=2.210522704.497302932.1720933982-1868601546.1720657917))

- Instale a IDE [NetBeans](https://www.apache.org/dyn/closer.cgi/netbeans/netbeans-installers/13/Apache-NetBeans-13-bin-windows-x64.exe?_ga=2.165821179.497302932.1720933982-1868601546.1720657917)

- Após a instalação do NetBeans instale o [Java FX Scenebuilder](https://www.oracle.com/java/technologies/javafxscenebuilder-1x-archive-downloads.html) (versão deste diretório 2.0)

⚠️ _Os instaladores são baixados diretamente do site oficial da Oracle e estão aqui apenas para praticidade do meu repositório._ Acesso o [site oficial](https://www.oracle.com/br/) e baixe suas versões.

## 🐧Instalação no Linux

A distribuição usada foi a Linux Ubuntu, logo as orientações serão para ela, adapte caso necessário para outras distribuições. Lembrando que o Ubuntu tem compatibilidade com arquivos `.deb` e usa o gerenciador `apt` para instalações.

- Para evitar erros de versões instale o JDK atual (versão deste diretório [15.0.2](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html?_ga=2.170466789.497302932.1720933982-1868601546.1720657917))

- Para evitar erros de versões instale o JRE atual (versão deste diretório [8u202](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html?_ga=2.210522704.497302932.1720933982-1868601546.1720657917))

> 📌 **NOTA:** Após instalar o JDK, realize baixe o JRE e caso seja necessário (devido a falta de um pacote instalavel), use o pacote `.tar.gz` para instalar os binários dentro do repositório do JDK. Use o comando: `sudo tar -xvf <versão baixada>.tar.gz -C /usr/lib/jvm`

- Instale a IDE [NetBeans](https://snapcraft.io/install/netbeans/ubuntu)
    - Opção via Snap Store ou pela Ubuntu Software
`sudo snap install netbeans --classic`

- Após a instalação do NetBeans instale o [Java FX Scenebuilder](https://www.oracle.com/java/technologies/javafxscenebuilder-1x-archive-downloads.html) (versão deste diretório 2.0)

> 📌 **NOTA:** Por questões de praticidade com o repositório, a documentação também está inserida no diretório de instalação conforme for permitido pelo.

⚠️ _Os instaladores são baixados diretamente do site oficial da Oracle e estão aqui apenas para praticidade do meu repositório._ Acesso o [site oficial](https://www.oracle.com/br/) e baixe suas versões.

> 📂 O Java FX e suas dependências (Scanbuilder), geram uma diretório `/dist` que contém o programa executável do projeto desenvolvido. Para que este executável seja utilizado, utilize um **duplo clique** no arquivo `.jar` ou abra o **diretório onde o arquivo se encontra** e use o comando `java -jar "<nomeArquivo.jar"` para executá-lo.

## Codificação em Java

Orientações e estudo simples a respeito da linguagem Java para sobreviver e relembrar conceitos, além de sixtases e aplicações, servindo como uma espécie de "cola". A [Java SE Development Kit 8u411 Documentation e JavaFX API Documentation](https://www.oracle.com/java/technologies/javase-jdk8-doc-downloads.html) também estão disponíveis.

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

> 📌 **Nota:** Mais orientações em Java Docs - Pesquisar no buscador.

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
Integer valorA = new Integer(3);
Float valorB = new Float(100.0);
Character valorC = new Character('D');
Boolean valorD = new Boolean(false);
```

> 📌 **NOTA:** Não existe tipo **String** na linguagem Java, mas sim uma **Classe Envólocro**.

Os 4 tipos citados acima, em nível de contextualização são na verdade "famílias" para cada tipo suportado pela linguagem Java, então, sabendo os tipos existentes e (como utilizá-los de forma tradicional ou em Typecast) entendendo as Classes Invólocro será mais fácil entender a tabela a seguir, que descreverá a maioria do tipos importantes para se saber.

![Tabela](/img/Captura%20de%20Tela%20do%20Curso%20de%20Java%20Para%20Iniciantes%20do%20Curso%20em%20Vídeo.png "Captura de Tela do Curso de Java Para Iniciantes do Curso em Vídeo")

> 📌 **NOTA:** Em contexto hitórico, Java foi desenvolvido para rodar em qualquer lugar, _"Escreva uma vez, execute em qualquer lugar"_. Isto faz com que os diferentes tipos numéricos sejam para adaptações, onde buscar melhoria de memória é essencial.

## Saída de Dados

```java
System.out.print("");
System.out.println("");
```

```java

```