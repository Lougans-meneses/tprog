import ada.tech.exemplo.Animal;
import ada.tech.exemplo.Operacao;
import ada.tech.exemplo.Verificador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // lista de animais
        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("peixe", false, true));
        animais.add(new Animal("canguru", true, false));
        animais.add(new Animal("coelho", true, false));
        animais.add(new Animal("tartaruga", false, true));

        // imprime os animais verificados
        //imprimir(animais, new VerificaSaltador());
        imprimir(animais, Animal::podeSaltar);
        imprimir(animais, Animal::podeNadar);


        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
        List<String> strings = List.of("","");
        //Collections.sort(strings, comp);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
            }
        });

        new Thread(() -> {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
        });

        //(parametros) -> expressao
        //(parametros) -> { bloco de codigo }

        Operacao soma = (a, b) -> a + b;
        Operacao multiplicacao = (a, b) -> a * b;

        System.out.printf("\nSoma eh %d", soma.executar(10, 2));
        System.out.printf("\nA multiplicacao eh %d", multiplicacao.executar(10, 2));

        calcular(32,5, (a, b) -> a - b);

        //PREDICATE
        int numero = -4;
        boolean isPar = numero % 2 == 0 ? true : false;
        Predicate<Integer> isParPredicate = (n) -> n % 2 == 0;
        Predicate<Integer> isNotNegative = (n) -> n > 0;
        System.out.printf("\nO numero %d eh primo eh negativo %b", numero,
                isParPredicate.and(isNotNegative).negate().test(numero));

        //CURIOSIDADE JAVA
        //condicao 1 && condicao 2
        //condicao 1 &  condicao 2

        /* List<String> lista = null;
            if(lista != null & lista.size() > 0) {

            }
        */

        //CONSUMER
        Consumer<String> consumer = (nome) -> System.out.printf("\nMeu nome eh %s", nome.toUpperCase());
        Consumer<String> consumerAfter = (nome) -> System.out.printf("\nMeu nome eh %s", nome.replace("x", "xandre"));
        consumer.andThen(consumerAfter).accept("Alex");


    }

    private static void calcular(int a, int b, Operacao op) {
        System.out.printf("\nResultado da operacao eh %d", op.executar(a, b));
    }

    private static void imprimir(List<Animal> animais, Verificador verificador) {
        for (Animal animal : animais) {
            // verificando
            if (verificador.verificar(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }

}