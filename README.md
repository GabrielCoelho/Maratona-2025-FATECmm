# Maratona de Programação 2025 - FATEC Mogi Mirim

Este repositório contém as soluções para os problemas propostos na Maratona de Programação 2025 da FATEC Mogi Mirim, realizada em 12 de abril de 2025. Embora não tenha participado presencialmente do evento, desenvolvi as soluções como exercício de estudo e aprendizado.

## Estrutura do Projeto

O projeto está organizado como uma aplicação Maven com a seguinte estrutura:

```
maratona2025/
├── src/
│   ├── main/java/br/com/devcoelho/maratona/
│   │   ├── soma.java             # Problema A - Soma de Números Pares
│   │   ├── palindromo.java       # Problema B - Encontrando o Maior Palíndromo
│   │   ├── labirinto.java        # Problema C - Caminho Mínimo em um Labirinto
│   │   ├── frequencia.java       # Problema D - Análise de Frequência em Fluxos de Dados
│   │   ├── tesouro.java          # Problema E - Caça ao Tesouro Subaquático
│   │   ├── multiplos.java        # Problema F - Multiples (Múltiplos de 3)
│   │   ├── distintos.java        # Problema G - Número de Pares (x,y) distintos
│   │   └── zeros.java            # Problema H - Área entre os Zeros da Função
│   └── test/
└── pom.xml
```

## Problemas Resolvidos

### Problema A - Soma de Números Pares
Implementação de um algoritmo para calcular a soma de todos os números pares em uma sequência de N números inteiros.

### Problema B - Encontrando o Maior Palíndromo
Algoritmo que identifica o maior palíndromo contido em uma string fornecida como entrada.

### Problema C - Caminho Mínimo em um Labirinto
Solução que encontra o caminho mais curto entre o ponto inicial (0,0) e o destino (linha-1, coluna-1) em um labirinto representado por uma matriz de caracteres, onde '#' representa uma parede e '.' representa um caminho livre.

### Problema D - Análise de Frequência em Fluxos de Dados
Programa que identifica e contabiliza a frequência de cada elemento único em um fluxo de dados numéricos, exibindo os resultados em ordem crescente dos valores.

### Problema E - Caça ao Tesouro Subaquático
Algoritmo que calcula a quantidade máxima de moedas que podem ser coletadas em um caminho da entrada (canto superior esquerdo) até a câmara do tesouro (canto inferior direito) de um templo submerso, movendo-se apenas para a direita ou para baixo.

### Problema F - Multiples
Programa que determina quantos números em uma lista de inteiros são múltiplos de 3.

### Problema G - Número de Pares (x,y) distintos
Algoritmo que conta o número de pares distintos que podem ser formados escolhendo dois elementos diferentes de uma lista.

### Problema H - Área entre os Zeros da Função
Programa que calcula a área aproximada entre a curva de uma função quadrática f(x)=a*x²+b*x+c e o eixo x dentro do intervalo definido pelos zeros da função, utilizando o método dos retângulos.

## Tecnologias Utilizadas

- Java 17
- Maven
- JUnit 5 (configurado para testes)

## Detalhes dos Problemas

| # | Nome do Problema | Arquivo | Breve Descrição |
|---|------------------|---------|-----------------|
| A | Soma de Números Pares | soma.java | Calcular a soma de todos os números pares em uma sequência. |
| B | Encontrando o Maior Palíndromo | palindromo.java | Encontrar o maior palíndromo em uma string. |
| C | Caminho Mínimo em um Labirinto | labirinto.java | Encontrar o caminho mais curto em um labirinto. |
| D | Análise de Frequência em Fluxos de Dados | frequencia.java | Contabilizar a frequência de elementos em um fluxo de dados. |
| E | Caça ao Tesouro Subaquático | tesouro.java | Calcular a quantidade máxima de moedas coletáveis em um caminho. |
| F | Multiples | multiplos.java | Contar quantos números em uma lista são múltiplos de 3. |
| G | Número de Pares (x,y) distintos | distintos.java | Calcular quantos pares distintos podem ser formados. |
| H | Área entre os Zeros da Função | zeros.java | Calcular a área entre as raízes de uma função quadrática. |

## Como Executar

Para compilar e executar o projeto:

```bash
# Navegar até o diretório do projeto
cd maratona2025

# Compilar o projeto
mvn clean compile

# Executar um problema específico (exemplo: Problema A)
java -cp target/classes br.com.devcoelho.maratona.soma
```

## Notas de Implementação

- As soluções priorizam a corretude e a clareza do código, seguindo boas práticas de programação.
- Alguns algoritmos utilizam estruturas de dados específicas como filas, mapas e matrizes para otimizar a solução.
- A programação dinâmica é aplicada na solução do problema do tesouro para encontrar o caminho ótimo.
- A implementação do labirinto utiliza o algoritmo de busca em largura (BFS) para encontrar o caminho mais curto.
- No problema de pares distintos (G), foi utilizada uma solução matemática direta: n*(n-1)/2.
- Para o problema H, utilizou-se o método dos retângulos para aproximação numérica da área.

## Informações do Evento

A Maratona de Programação da FATEC Mogi Mirim "Arthur de Azevedo" ocorreu em 12 de abril de 2025, com duração de 4 horas (13:30h às 17:30h). A competição contou com o patrocínio de empresas como: Refrigerantes Mogi, NeoLink, Infonacci, Beecloud, Zucchetti e Cortag.

## Autor

Gabriel Coelho Soares

## Licença

Este projeto está sob a licença MIT.
