import ada.tech.exemplo.Animal;
import ada.tech.exemplo.Operacao;
import ada.tech.exemplo.VerificaSaltador;
import ada.tech.exemplo.Verificador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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