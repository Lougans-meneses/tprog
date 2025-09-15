import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

/*
        //data atual
        LocalDate dataAtual = LocalDate.now();

        //hora atual
        LocalTime horaAtual = LocalTime.now();

        //data e hora
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println(dataHoraAtual);

        //LocalDate dataAniversarioGuilherme = LocalDate.parse("1994-02-16");

        System.out.println(dataAniversarioGuilherme);
        LocalTime horario = LocalTime.of(19, 30);

        LocalDate novaData = dataAniversarioGuilherme.plusDays(4);

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataAniversarioGuilherme));
        System.out.println(dataAniversarioGuilherme.getDayOfWeek());
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(novaData));


        ZonedDateTime saoPaulo = ZonedDateTime.of(dataHoraAtual, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime lisboa = ZonedDateTime.of(dataHoraAtual, ZoneId.of("Europe/Lisbon"));

        System.out.println("Sao Paulo " + saoPaulo);
        System.out.println("Lisboa " + lisboa);

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Lisbon")));
*/

        //LocalDate ou LocalTime = Data literal formatada
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDataEHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        formatter.format(LocalDate.now());
        LocalDate dataAniversarioGuilherme = LocalDate.of(1994, 2, 16);
        LocalDate dataNascimentoAlex = LocalDate.parse("19/10/1987", formatter);

        LocalTime inicio = LocalTime.of(8, 0);
        LocalTime fim = LocalTime.of(18, 0);

        //Duration
        Duration duration = Duration.between(inicio, fim);
        System.out.println(duration);
        System.out.println("Em horas " + duration.toHours());
        System.out.println("Em minutos " + duration.toMinutes());

        //Period
        Period period = Period.between(dataNascimentoAlex, dataAniversarioGuilherme);
        System.out.printf("\nDiferença em anos %d", period.getYears());




    }
}