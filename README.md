# Exercícios de Lambdas e Programação Funcional em Ja

## Exercício 1
Crie uma interface funcional `Operacao` com um método `executar(int a, int b)` que retorne um inteiro.  
Implemente duas operações utilizando **lambdas**: uma soma e uma subtração.  
Depois, crie uma classe principal para executar ambas as operações.

---

## Exercício 2
Crie uma interface funcional `Mensagem` com um método `exibir(String texto)`.  
Implemente um lambda que receba uma mensagem e a exiba formatada da seguinte forma:  
`[MENSAGEM]: <texto>`.

---

## Exercício 3 (Desafio)
Crie uma interface funcional `Validador<T>` com um método `boolean validar(T valor)`.  
Implemente lambdas para as seguintes validações:
- Verificar se uma string não está vazia.
- Verificar se um número é positivo.
- Verificar se uma senha tem pelo menos 8 caracteres e contém um número.

Na classe principal, utilize os validadores criados para testar diferentes entradas.
