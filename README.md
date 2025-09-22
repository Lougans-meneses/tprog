# Exercício de Paginação com Stream (Java) - Produtos

## Enunciado

Implemente um sistema simples de **paginação** em Java utilizando `Stream`, com os métodos `skip` e `limit`.

### Regras:
1. Crie uma classe `Produto` com os seguintes atributos:
    - `String sku`
    - `String descricao`
    - `BigDecimal valor`
2. Crie uma lista com **10 produtos** fictícios.
3. Implemente um método `paginar(List<Produto> lista, int pagina, int tamanhoPagina)` que:
    - Retorne uma sublista representando os produtos da página solicitada.
    - Utilize obrigatoriamente os métodos `skip` e `limit` de `Stream`.
4. Crie uma classe `Main` que teste a paginação chamando diferentes páginas e exibindo o resultado no console.

### Exemplos esperados:
- Página 1, tamanho 3 → Exibe 3 primeiros produtos
- Página 2, tamanho 3 → Exibe os próximos 3 produtos
- Página 4, tamanho 3 → Exibe o último produto

---
**Tarefa:** Implemente a classe `Produto`, o método de paginação e os testes na classe `Main`.