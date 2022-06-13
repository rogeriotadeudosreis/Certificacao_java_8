package Aula_03_Dados_Calendarios_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

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
        System.out.println(ldt2.getYear());
        System.out.println(ldt2.getMonth());
        System.out.println(ldt2.getDayOfMonth());
        System.out.println(ldt2.getHour());
        System.out.println(ldt2.getMinute());
        System.out.println(ldt2.getSecond());

        System.out.println(ldt2.get(ChronoField.DAY_OF_MONTH));

    }
}
