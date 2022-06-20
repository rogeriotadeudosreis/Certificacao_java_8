package alura_conteudo_certificacao.Aula_03_Dados_Calendarios_java_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Video_04_DateTime3 {

    public static void main(String[] args) {

        /*
        converter data do tipo Date para LocalDateTime
         */
        Date d = new Date();
        Instant i = d.toInstant();
        LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

        // converter uma data Calendar para LocalDateTime
        Calendar c = Calendar.getInstance();
        Instant i2 = c.toInstant();
        LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault()); // o segundo parâmetro aqui está pegando
                                                                                  // o fuso horário padrão do sistema operacional
        // fazer o inverso
        Instant i1 = ldt.toInstant(ZoneOffset.UTC); // aqui o ZonedOffset pega apenas o fuso horário local, sem se
                                                    // preocupar com lugar

        Date d2 = Date.from(i1); // converter um instant para Date
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d2);;


    }

}
