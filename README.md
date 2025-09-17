# Exercícios de Lambdas e Programação Funcional em Java

## Exercício 1
Crie uma interface funcional chamada `Conversor` com um método `String converter(String texto)`.  
Implemente duas conversões usando **lambdas**:  
- Converter o texto para **maiúsculas**.  
- Inverter os caracteres de uma string.  

Na classe principal, teste as duas implementações com diferentes textos.

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
