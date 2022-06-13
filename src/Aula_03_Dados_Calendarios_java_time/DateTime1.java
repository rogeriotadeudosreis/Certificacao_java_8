package Aula_03_Dados_Calendarios_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTime1 {
    /*
    LocalDate = Data sem hora
    LocalTime = somente a hora
    LocalDateTime = Data com hora
    MonthDay = dia de um mes
    YearMont = mes e ano
     */

    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(t);
//        System.out.println(ld);
//        System.out.println(ldt);

//        pegando data com diferença de fuso horário
        LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
        LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
//        System.out.println(t1);
//        System.out.println(t2);

        LocalTime meioDia = LocalTime.of(12, 0);

        LocalDate dataQualquer = LocalDate.of(2022, 3, 8);
        LocalDate dataQualquer2 = LocalDate.of(202, Month.MARCH, 8);

        LocalDateTime algumMomento = LocalDateTime.of(2022, 06, 13, 8, 39, 40);
//        System.out.println(algumMomento);

        LocalDateTime almoco = LocalDateTime.of(dataQualquer, meioDia);
//        System.out.println(almoco);

        LocalDateTime ldt2 = LocalDateTime.of(2022, 06, 13, 8, 39, 40);
//        System.out.println(ldt2.getYear());
//        System.out.println(ldt2.getMonth());
//        System.out.println(ldt2.getDayOfMonth());
//        System.out.println(ldt2.getHour());
//        System.out.println(ldt2.getMinute());
//        System.out.println(ldt2.getSecond());

//        System.out.println(ldt2.get(ChronoField.DAY_OF_MONTH));

        MonthDay day = MonthDay.of(1,1);
        MonthDay day2 = MonthDay.of(1,2);

//        System.out.println(day.isBefore(day2));
//        System.out.println(day2.isAfter(day));
//        System.out.println(day2.isBefore(day));
//        System.out.println(day.isAfter(day2));

        /*
        todos os valos de data são imutáveis, ou seja, não podem ser alterados, porém temos
        uma saída
        Podemos usar métodos como o with por exemplo onde podemos alterar uma data, porém
        um detalhe importante, sempre que alteramos, na realidade vamos criar um novo
        objeto de data com o novo valor, com a nova data desejada, conforme o exemplo abaixo,
        observe...
         */
        LocalDate d = LocalDate.of(2022,06,13);

        LocalDate d2 = d.withMonth(5).withYear(2021); // aqui criamos o objeto " d2 " para criar uma nova data
        System.out.println(d);
//        System.out.println(d2);
        /*
        outro ponto importante, vc só conseguirá manipular dados que existem dentro do objeto, por exemplo:
        LocalDate não tem hora, então tentar manipular a hora nesse caso, irá causar erro de compilação.
         */

        // podemos fazer operações de soma e subtração de uma determinada data
        LocalDate d3 = d.plusDays(2).plusMonths(1).minusYears(1);
//        System.out.println(d3);

        LocalDate d4 = d.minus(4, ChronoUnit.YEARS);
        System.out.println(d4);

        /*
        Observação importante: quando fazemos conta/operações usamos o chronoUnit
        Quando precisamos pegar um campo, uamos o chronofield
         */


    }
}
