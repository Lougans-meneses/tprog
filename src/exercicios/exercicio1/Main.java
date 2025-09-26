package exercicios.exercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Dia atual de agora: " + dataAtual.getDayOfMonth());
        System.out.println("Mês atual de agora: " + dataAtual.getMonthValue());
        System.out.println("Ano de agora: " + dataAtual.getYear());

        LocalDate diaMaisDez = dataAtual.plusDays(10);
        System.out.println("Dia atual mais 10 dias: " + diaMaisDez.getDayOfMonth());
    }
}
