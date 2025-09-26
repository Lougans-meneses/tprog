package exercicios.exercicio4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        Scanner leitura = new Scanner(System.in);
        System.out.println("Pressione enter para calcular diferença da hora do sistema para o seu enter");
        leitura.nextLine();
        LocalTime horaDoUsuario = LocalTime.now();
        System.out.println("Hora do Usuario: " + horaDoUsuario);

        Duration diferenca = Duration.between(horaAtual, horaDoUsuario);
        System.out.println("Diferença de: " + diferenca.getSeconds() + " segundos " + diferenca.getNano() + " nanosegundos.");

    }
}
