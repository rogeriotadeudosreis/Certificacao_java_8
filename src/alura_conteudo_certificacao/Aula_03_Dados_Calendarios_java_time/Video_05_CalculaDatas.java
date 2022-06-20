package alura_conteudo_certificacao.Aula_03_Dados_Calendarios_java_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Video_05_CalculaDatas {

    public static void main(String[] args) {

        /*
        Fazendo contas com datas, cálculos com datas
         */

        Instant i = Instant.now();
        Duration doisminutos = Duration.ofMinutes(10);
        Instant i2 = i.plus(doisminutos);
//        System.out.println(i);
//        System.out.println(i2);

        // tirar a diferença entre um momento e outro
        Instant m1 = Instant.EPOCH;
        Instant m2 = Instant.now();
        Long segundos = Duration.between(m1, m2).getSeconds();
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(segundos);

        // diferença entre datas LocalDate
        LocalDate birth = LocalDate.of(1972, 11, 28);
        LocalDate now = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birth, now); // tirando a diferente entre nascimento e agora em anos
        long ageMonth = ChronoUnit.MONTHS.between(birth, now); // tirando a diferente entre nascimento e agora em meses
        long ageDays = ChronoUnit.DAYS.between(birth, now); // tirando a diferente entre nascimento e agora em dias
//        System.out.println(age);
//        System.out.println(ageMonth);
//        System.out.println(ageDays);

        // também podemos tirar a diferença em período mesmo, pra entendermos
        Period period = Period.between(birth, now);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
