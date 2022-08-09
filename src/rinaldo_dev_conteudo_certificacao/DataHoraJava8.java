package rinaldo_dev_conteudo_certificacao;

import javax.swing.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DataHoraJava8 {

    public static void main(String[] args) {

        // LocalDaqte - representa apenas uma data
        LocalDate ldNow = LocalDate.now();
        System.out.println("Data atual do sistema: " + ldNow);

        LocalDate ld = LocalDate.of(1972, Month.NOVEMBER, 28);
        System.out.println("LocalDate específico: " + ld);
        LocalDate ld2 = ld.plusYears(2);
        System.out.println("LocalDate específico acrescentado mais 2 anos: " + ld2);

        // LocalTime - representa uma hora
        LocalTime ltNow = LocalTime.now();
        System.out.println("LocalTime atual do sistema: " + ltNow);
        LocalTime lt = LocalTime.of(23, 45, 14, 10000);
        System.out.println("Local time específico: " + lt);

        // LocalDateTime - representaaa
        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println("LocalDateTime atual do sistema: " + ldtNow);
        LocalDateTime ldt = LocalDateTime.of(1974, 07, 25, 15, 25, 59, 25465205);
        System.out.println("LocalDateTime específico: " + ldt);

        //Instant - representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970)
        Instant iNow = Instant.now();
        System.out.println("Instant, um momento atual do sistema: " + iNow);
        Instant i = Instant.ofEpochMilli(500000000000L);
        System.out.println("Um momento específico em milissegundos: " + i);
        Instant plus = i.plus(2, ChronoUnit.DAYS);
        System.out.println("Um momento específico do tempo acrescentado 2 dias: " + plus);

        //ZonedDateTime - representa uma data e hora completa inclusive com fuso horário
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println("ZonedDateTime atual do sistema: " + zdtNow);
        ZoneId zoneId = ZoneId.of("America/New_York"); // pegando o fuso horário de um determinado local
        ZonedDateTime zdt = ZonedDateTime.of(ld, lt, zoneId);
        System.out.println("ZonedDateTime específico adicionado também o fuso horário específico: " + zdt);
    }
}
