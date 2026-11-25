# Calculadora de juros compostos

Programa de terminal em Java que calcula quanto um valor rende com juros compostos mensais. Foi meu primeiro experimento próprio no plano de estudos (semana 1).

## Como funciona

O programa pede três informações:

1. o valor inicial (ex.: `1000`)
2. a taxa de juros mensal em % (ex.: `1.5`, use ponto, não vírgula)
3. o número de meses (ex.: `24`)

E calcula o montante final com a fórmula de juros compostos:

```
M = C × (1 + i)^n
```

onde `C` é o valor inicial, `i` é a taxa mensal em decimal (1,5% = 0,015) e `n` é o número de meses.

## Exemplo

```
Digite o valor inicial: 1000
Digite a taxa mensal (%): 1.5
Numeros de meses: 24
Montante final: R$ 1429,50
Juros: R$ 429,50
```

## Como rodar

```bash
javac JurosCompostos.java
java JurosCompostos
```

## O que aprendi

- Ler dados do usuário com `Scanner` e converter texto em número (`Double.valueOf`, `Integer.valueOf`)
- Usar `double` para valores com casas decimais e `int` para contagens
- Calcular potências com `Math.pow`
- Formatar a saída com 2 casas decimais usando `printf("%.2f")`

## Limitações

- A taxa precisa ser digitada com ponto (`1.5`); com vírgula o programa encerra com erro.
- Considera taxa fixa durante todo o período, sem aportes mensais, impostos ou inflação.

## Próximos passos

- [ ] Versão 2 (depois de aprender loops): tabela mês a mês mostrando a evolução do saldo
- [ ] Comparar juros simples e compostos lado a lado
- [ ] Adicionar aportes mensais
- [ ] Tratar entrada inválida (vírgula, texto, número negativo)