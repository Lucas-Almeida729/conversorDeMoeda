# 💱 Conversor de Moedas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## 💻 Descrição do Projeto

Este é um projeto de **Conversor de Moedas** desenvolvido em Java. A aplicação consome a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter cotações em tempo real e realizar conversões entre diferentes moedas via console.

O projeto foi desenvolvido como parte de um desafio de programação da **ALURA ONE ORACLE NEXT EDUCATION**, focando no uso de classes, interfaces, consumo de APIs e manipulação de arquivos JSON.

## ⚙️ Funcionalidades

- [x] Menu interativo via console para escolha de moedas.
- [x] Conversão em tempo real utilizando taxas atualizadas.
- [x] Suporte para as seguintes moedas:
  - **USD**: Dólar Americano
  - **BRL**: Real Brasileiro
  - **ARS**: Peso Argentino
  - **COP**: Peso Colombiano
- [x] Tratamento de erros de entrada e conexão.

## 🛠️ Tecnologias Utilizadas

* **Java** (JDK 11 ou superior) - Linguagem principal.
* **java.net.http.HttpClient** - Para realizar as requisições HTTP à API.
* **Gson** (Google) - Biblioteca para analisar (parsear) o JSON retornado pela API.

## 🚀 Como executar o projeto

### Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:
* [Java JDK](https://www.oracle.com/java/technologies/downloads/) (versão 11 ou superior).
* Uma IDE Java (IntelliJ IDEA, Eclipse, VS Code).
* A biblioteca [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson).

### Passo a passo

1.  **Clone o repositório**
    ```bash
    git clone [https://github.com/Lucas-Almeida729/conversorDeMoeda](https://github.com/Lucas-Almeida729/conversorDeMoeda)
    ```

2.  **Configure a Chave da API**
    * Obtenha uma chave gratuita em [ExchangeRate-API](https://www.exchangerate-api.com/).
    * No arquivo `Principal.java`, substitua `"SUA_CHAVE_AQUI"` pela sua API Key.

3.  **Adicione o Gson ao projeto**
    * Se estiver usando **Maven**, adicione ao `pom.xml`:
        ```xml
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.10.1</version>
        </dependency>
        ```
    * Se não usar gerenciador de dependências, baixe o `.jar` do Gson e adicione às bibliotecas do projeto (Classpath).

4.  **Execute a aplicação**
    * Rode o arquivo `Principal.java` na sua IDE.

## 📸 Exemplo de Uso

```text
*************************************************
Seja bem-vindo/a ao Conversor de Moeda =]

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
Escolha uma opção válida:
*************************************************