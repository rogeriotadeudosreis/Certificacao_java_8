package Aula_03_Dados_Calendarios_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Video_06_FormatandoDatas {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println(formatter.format(now));
//        System.out.println(now.format(formatter));

        LocalDate d1 = LocalDate.parse("28/11/1972", formatter);// aqui formatamos para o tipo LocalDate
//        System.out.println(d1);

        LocalDateTime now1 = LocalDateTime.of(2022, 06, 15, 10, 10, 56, 123);
//        System.out.println(now1);

        LocalDate d = LocalDate.of(2014, 4, 1); //2014-04-01
        d = d.withDayOfMonth(15).withMonth(3); //chaining
//        System.out.println(d); //2015-03-15

        System.out.println(YearMonth.now().isSupported(
                ChronoUnit.MONTHS));
        System.out.println(YearMonth.now().isSupported(
                ChronoField.DAY_OF_MONTH));
        System.out.println(LocalDate.now().isSupported(
                ChronoUnit.DAYS));
        System.out.println(LocalDateTime.now().isSupported(
                ChronoField.HOUR_OF_AMPM));
        System.out.println(LocalDateTime.now().isSupported(
                ChronoField.YEAR));
    }
}
