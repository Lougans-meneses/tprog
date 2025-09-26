package exercicios.exercicio5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dataEHoraEvento = LocalDateTime.of(2025, 9, 30, 8, 9);
        ZoneId zonaSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime eventoSaoPaulo = ZonedDateTime.of(dataEHoraEvento, zonaSaoPaulo);
        System.out.println("Evento internacional " + dataEHoraEvento);

        ZonedDateTime eventoNovaIorque = eventoSaoPaulo.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime eventoToquio = eventoSaoPaulo.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime eventoLondres = eventoSaoPaulo.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("\nEvento em São Paulo " + eventoSaoPaulo);
        System.out.println("Evento em Nova Iorque " + eventoNovaIorque);
        System.out.println("Evento em Tóquio " + eventoToquio);
        System.out.println("Evento em Londres " + eventoLondres);


    }
}
