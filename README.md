# Simulação de Jogo de Xadrez em Java

Este repositório contém uma aplicação que simula um jogo de xadrez rodando no terminal. O projeto foi desenvolvido com o objetivo de aplicar e consolidar conhecimentos em Java, incluindo a utilização de conceitos avançados como herança, polimorfismo, enums e gerenciamento de exceções personalizadas.

## Propósito do Projeto

Este projeto foi desenvolvido com os seguintes objetivos:

- Praticar conceitos de **Programação Orientada a Objetos (POO)**;
- Implementar regras e lógica de um jogo complexo como o xadrez;
- Aplicar manipulação de exceções personalizadas;
- Consolidar o uso de coleções, enums, e classes abstratas em Java.


## Funcionalidades

A aplicação oferece os seguintes recursos:

### Gerenciamento do Jogo
- Controlar turnos e movimentos dos jogadores;
- Identificar situações de xeque e xeque-mate;
- Capturar peças adversárias;
- Promover peões ao chegarem ao final do tabuleiro;
- Realizar movimentos especiais, como Roque e En Passant.

### Interface com o Usuário
- Exibir o tabuleiro no terminal;
- Indicar movimentos possíveis para as peças selecionadas;
- Ler e interpretar entradas de posição no formato do xadrez (ex.: `e2`).

### Validação e Tratamento de Erros
- Validar posições e movimentos de acordo com as regras do jogo;
- Tratar exceções específicas, como posições inválidas ou movimentos ilegais.

## Estrutura do Projeto

O projeto é dividido em duas camadas principais:

### Chess Layer
- **ChessException**: Exceção personalizada para erros específicos do jogo de xadrez.
- **Color**: Enum que define as cores das peças (`BLACK`, `WHITE`).
- **ChessPosition**: Representa posições específicas no formato do xadrez (ex.: `a1`, `b5`).
- **ChessMatch**: Controla o estado do jogo, incluindo turnos, movimentos e regras.
- **ChessPiece**: Classe abstrata que representa peças genéricas no xadrez. Inclui funcionalidades básicas para peças específicas:
  - **Bishop** (Bispo)
  - **King** (Rei)
  - **Knight** (Cavalo)
  - **Pawn** (Peão)
  - **Queen** (Rainha)
  - **Rook** (Torre)

### Board Layer
- **Board**: Representa o tabuleiro de xadrez com dimensões e peças.
- **BoardException**: Exceção personalizada para erros relacionados ao tabuleiro.
- **Piece**: Classe abstrata para peças genéricas no tabuleiro.
- **Position**: Representa posições no tabuleiro em formato genérico (linha, coluna).
- **UI**: Gerencia a interação com o usuário e a exibição do tabuleiro no terminal.

## Regras Implementadas

- Movimentos de todas as peças conforme as regras oficiais do xadrez;
- Validação de movimentos ilegais, como pular peças em movimentos não permitidos;
- Xeque, xeque-mate e empate;
- Captura especial "en passant";
- Promoção de peões ao alcançarem a última fileira.


## Exemplos de Uso

### Inicialização do Jogo

Ao iniciar, o tabuleiro é exibido no terminal com todas as peças na posição inicial:
```
8 R  N  B  Q  K  B  B  R
7 P  P  P  P  P  P  P  P
6 .  .  .  .  .  .  .  .
5 .  .  .  .  .  .  .  .
4 .  .  .  .  .  .  .  .
3 .  .  .  .  .  .  .  .
2 P  P  P  P  P  P  P  P
1 R  N  B  Q  K  B  N  R
  a  b  c  d  e  f  g  h
```

### Realização de Movimentos

Ao selecionar uma peça, os movimentos possíveis são destacados. Por exemplo, ao selecionar o peão em `e2`:
```
8 R  N  B  Q  K  B  N  R
7 P  P  P  P  P  P  P  P
6 .  .  .  .  .  .  .  .
5 .  .  .  .  .  .  .  .
4 .  .  .  .  .  .  .  .
3 .  .  .  .  .  .  .  .
2 P  P  P  P  P  P  P  P
1 R  N  B  Q  K  B  N  R
  a  b  c  d  e  f  g  h

Movimentos possíveis:
- e3
- e4
```

## Tecnologias Utilizadas

- **Linguagem**: Java
- **IDE**: IntelliJ IDEA

## Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/leo-vasi/chess-game-java.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd chess-game-java
   ```

3. Abra o projeto em sua IDE.

4. Compile e execute a aplicação.

5. Interaja com o jogo diretamente pelo terminal da IDE.


