import ada.tech.exemplo.Animal;

import java.util.ArrayList;
import java.util.Arrays;
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

        //normal
        animais.stream();
        //parelela
        animais.parallelStream();

        //Stream de array
        //int [] nums = new int[1,2,3];
        //Arrays.stream(nums);

        //INTERMEDIARIAS

        //map - transformacao
        /* animais.stream()
                            .map(animal -> {
                                animal.setEspecie(animal.getEspecie().toUpperCase());
                                return animal;
                            })
                            .forEach(System.out::println);*/

        //filter
        /*animais.stream()
                .filter(animal -> animal.getEspecie().startsWith("c"))
                .forEach(System.out::println);

        Predicate<Animal> isNadador = Animal::podeNadar;
        Consumer<Animal> consumer = (animal) -> System.out.println(animal.toString().toUpperCase());

        animais.stream()
                .filter(isNadador)
                .forEach(consumer);
*/
        //skip - pular itens
        /*animais.stream()
                .skip(2)
                .forEach(System.out::println);
*/
        //limit - quantidade a retornar
        animais.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }

}