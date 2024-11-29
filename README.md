# 🌍 Conversor de Moedas

Um conversor de moedas simples desenvolvido em **Java**, que permite a conversão entre diferentes moedas utilizando a **[ExchangeRate API](https://www.exchangerate-api.com/)** para obter as taxas de câmbio em tempo real.

## ✨ Funcionalidades

- Conversão entre várias moedas, incluindo:
    - **Pesos (Argentina)** para **Reais (Brasil)** e vice-versa
    - **Boliviano (Bolívia)** para **Reais (Brasil)** e vice-versa
    - **Pesos (Chile)** para **Reais (Brasil)** e vice-versa
    - **Pesos (Colômbia)** para **Reais (Brasil)** e vice-versa
    - **Dólar (Estados Unidos)** para **Reais (Brasil)** e vice-versa

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **HTTP Client (Java 11)**: Para realizar chamadas à API de taxas de câmbio.
- **Gson**: Biblioteca para manipulação e conversão de dados JSON.

## ⚙️ Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:
- Java 11 ou superior
- Um IDE compatível (como IntelliJ IDEA ou Eclipse)
- Git (para clonar o repositório)

## 🚀 Como Usar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/RangelMRK/challenge-conversor-alura-one.git
   
2. **Navegue até o diretório do projeto**:
   ```bash
   cd challenge-conversor
   
3. **Compile o programa**:
    ```bash
   javac -cp lib/*:. src/*.java
   
4. **Execute o programa**:
    ```bash
   java -cp lib/*:. src.Main

## 💻 Exemplo de Uso
 No terminal, você será solicitado a escolher a conversão desejada. Por exemplo:
 
```java
Olá, bem-vindo ao conversor de Moedas (beta)!

Operações de conversão disponíveis: 
________________________________________________________
1. Pesos (Argentina) para Reais (Brasil) (ARS para BRL)
2. Reais (Brasil) para Pesos (Argentina) (BRL para ARS)
...
Escolha a opção de conversão que deseja realizar (1-10): 1
Escreva o valor que deseja ser convertido: 1000
O valor de 1000 ARS na taxa de conversão atual é: 26.50 BRL
```

## 📂 Estrutura do Projeto
```graphql
challenge-conversor/
├── src/
│   ├── br/com/rangelmrk/conversormoedas/
│   │   ├── classes/
│   │   │   ├── Conversoes.java    # Classe contendo as Siglas para conversões
│   │   │   ├── Opcoes.java        # Enum para as opções de conversão
│   │   │   ├── Resultado.java     # Classe para exibir o resultado da conversão
│   │   │   └── Solicitador.java   # Classe responsável pela comunicação com a API
│   │   ├── principal/
│   │   │   └── Main.java          # Classe principal que inicia o programa
├── .gitignore                     # Arquivo para ignorar arquivos desnecessários no Git
├── challenge-conversor.iml        # Arquivo de configuração do projeto no IntelliJ IDEA
├── README.md                      # Documentação do projeto
├── out/                           # Diretório de saída de compilação
```
## 🌟 Melhorias Futuras
- Implementar suporte para novas moedas.
- Adicionar uma interface gráfica (GUI) para melhorar a usabilidade. 
- Implementar testes unitários para garantir a confiabilidade do código.

## 🌐 Sobre a ExchangeRate API
A ExchangeRate API fornece taxas de câmbio atualizadas em tempo real, permitindo conversões precisas entre diversas moedas. Para saber mais, visite o site oficial [ExchangeRate API](https://www.exchangerate-api.com/).