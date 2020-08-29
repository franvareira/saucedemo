Este projeto tem por objetivo simular uma compra com sucesso no site "https://www.saucedemo.com/index.html"

##Tecnologias Utilizadas

Este projeto conta com as seguintes tecnologias:  

- Java 
- JUnit5
- Maven
- ExtentReport 
- Java Faker 
- WebDriveManager 
- Intellij 

##Padrões Utilizados

**Main/Java**

- **Framework** : Pasta onde se encontram classes de abstracao.

- **Utils** :  Pasta onde ficam classes com métodos auxiliares para serem reutilizadas em outras classes.

**Main/Resources**

Pasta onde se encontram arquivos de inputs para execução dos testes.


**Test/Java**

- **PageObjects** : Pasta onde se encontram classes de mapeamento dos WebElements.

- **Tasks** : Pasta onde se encontram classes de iteração com os WebElements.

- **TestCases** : Pasta onde se encontram classes e métodos de Testes.

- **TestSuites** : Pasta onde se encontram classes de suites de execução dos Tests.


## Como executar o projeto?

Primeiramente, você deverá clonar o projeto na sua máquina por meio do seguinte comando:

`git clone https://github.com/franvareira/saucedemo.git`

**Abrindo o projeto na IDE**

Este projeto foi feito no IntelliJ, porém, você pode usar a IDE de sua preferência para executa-lo.

Assim que abri-lo, clique com o botão direito do mouse em cima da classe **TestSuites/AllTests** e execute-a.

**Executando via CMD**

Para executar o projeto via linha de comando, é preciso, primeiro, ter o Maven instalado e configurado na sua máquina.
(https://dicasdejava.com.br/como-instalar-o-maven-no-windows/)
Feito isso, dentro da pasta do projeto, abra o CMD e digite o seguinte comando:

`mvn test`

Deverá executar a sequencia de testescases do pacote.

## Reports

Para visualizar os reports, após a execução, abra a pasta raiz do projeto e acesse a pasta "Report" e abra o aquivo MyReport.html.
