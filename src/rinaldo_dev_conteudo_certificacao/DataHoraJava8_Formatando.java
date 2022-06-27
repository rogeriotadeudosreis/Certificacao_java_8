package rinaldo_dev_conteudo_certificacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DataHoraJava8_Formatando {
    public static void main(String[] args) {

        // Gerando uma data atual do sistema
        LocalDate date = LocalDate.now();
        System.out.println("Data sem formatação: " + date);

        // Gerando uma formatação padrão para formatar uma data, sem a hora
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Formatando uma data e armazenando em uma String
        String dataFormatada = dateFormatter.format(date);
        System.out.println("Data formatada: " + dataFormatada);

        //////////////////////////////////////////////////////////////////////////////////////////////

        // Gerando uma hora atual do sistema
        LocalTime time = LocalTime.now();
        System.out.println("Time not format: " + time);

        // Gerando uma formatação padrão para a hora, apenas a hora, minutos e segundos
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Formatando uma hora conforme padrão e armazenando em uma String
        String timeFormatada = timeFormatter.format(time);
        System.out.println("Time formated: " + timeFormatada);

        //////////////////////////////////////////////////////////////////////////////////////////////

        // Gerando uma data e hora, juntos
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Data e hora atual do sistema sem formatação: " + dateTime);

        // Gerando uma formatação padrão para data e hora, juntos
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Formatando uma data e hora, e armazenando em uma String
        String dateTimeFormatada = dateTimeFormatter.format(dateTime);
        System.out.println("Data e hora formatadas: " + dateTimeFormatada);

        //////////////////////////////////////////////////////////////////////////////////////////////

        /*
        Agora vamos fazer o inverso, pegar uma String e converter para cada tipo de data e hora.
         */

        // Convertendo uma data String para TemporalAccessor
        TemporalAccessor parseData = dateFormatter.parse(dataFormatada);
        System.out.println(parseData);
        // Convertendo um temporal para um LocalDate
        LocalDate dataFrom = LocalDate.from(parseData);
        System.out.println("Data String convertida para LocalDate: " + dataFrom);

        //////////////////////////////////////////////////////////////////////////////////////////////

        // Convertendo uma hora String para TemporalAccessor
        TemporalAccessor parseHora = timeFormatter.parse(timeFormatada);
        System.out.println(parseHora);
        // Convertendo um temporal para LocalTime
        LocalTime horaFrom = LocalTime.from(parseHora);
        System.out.println("Hora String convertida para LocalTime: " + horaFrom);

        //////////////////////////////////////////////////////////////////////////////////////////////

        // Convertendo um data e hora juntos para TemporalAccessor
        TemporalAccessor parseDataHora = dateTimeFormatter.parse(dateTimeFormatada);
        System.out.println(parseDataHora);
        // Convertendo uma data e hora temporal para LocalDateTime
        LocalDateTime dataHoraFrom = LocalDateTime.from(parseDataHora);
        System.out.println("Data e hora convertidas para LocalDateTime: " + dataHoraFrom);


    }
}
