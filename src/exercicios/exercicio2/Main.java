package exercicios.exercicio2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual de agora: " + horaAtual);

        LocalTime horaAtualMaisDuasETrinta = horaAtual.plusHours(2).plusMinutes(30);
        System.out.println("Hora atual + 2 e 30: " + horaAtualMaisDuasETrinta);
    }
}
