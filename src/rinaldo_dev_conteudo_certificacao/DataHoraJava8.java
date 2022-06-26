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
        System.out.println(ldNow);

        LocalDate ld = LocalDate.of(1972, Month.NOVEMBER,28);
        System.out.println(ld);
        LocalDate ld2 = ld.plusYears(2);
        System.out.println(ld2);

        // LocalTime - representa uma hora
        LocalTime ltNow = LocalTime.now();
        System.out.println(ltNow);
        LocalTime lt = LocalTime.of(23,45,14,10000);
        System.out.println(lt);

        // LocalDateTime - representa
        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow);
        LocalDateTime ldt = LocalDateTime.of(1974,07,25,15,25,59,25465205);
        System.out.println(ldt);

        //Instant - representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970)
        Instant iNow = Instant.now();
        System.out.println(iNow);
        Instant i = Instant.ofEpochMilli(500000000000L);
        System.out.println(i);
        Instant plus = i.plus(2, ChronoUnit.DAYS);
        System.out.println(plus);

        //ZonedDateTime - representa uma data e hora completa inclusive com fuso horário
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(zdtNow);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zdt = ZonedDateTime.of(ld,lt,zoneId);
        System.out.println(zdt);


    }
}
