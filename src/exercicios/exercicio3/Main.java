package exercicios.exercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate minhaDataDeAniversario = LocalDate.of(1965, 10, 1);
        LocalDate suaDataDeAniversario = LocalDate.of(1979, 2, 8);

        Period diferencaDeDatas = Period.between(minhaDataDeAniversario, suaDataDeAniversario);
        System.out.printf("Diferença entre as datas: %d anos, %d Meses, Dias %d",
                diferencaDeDatas.getYears(),
                diferencaDeDatas.getMonths(),
                diferencaDeDatas.getDays());

    }
}
