package rinaldo_dev_conteudo_certificacao;

/*
Java 8 - API de data a hora (Period e Duration)

Period - representa um espaço de tempo baseado em data, dias, meses, anos, etc...
Duration - representa também um espaço de tempo, porém baseado em tempo, horas, minutos, segundos, milissegundos
 */

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DataHoraJava8_Period_duration {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        Period of = Period.of(1, 5, 3);
        System.out.println(of);

        Period cincoAnos = Period.ofYears(5);
        System.out.println(cincoAnos);

        LocalDate ld = LocalDate.of(1972, Month.NOVEMBER,28); // criando uma data qualquer
        LocalDate ld2 = ld.plusYears(2); // aqui estamos pegando uma data criada e acrescentando 02 anos
        Period between = Period.between(ld, ld2); // aqui estamos pegando a diferente entre uma data e outra
        System.out.println(between);

        LocalDate nascimento = LocalDate.of(1972, Month.NOVEMBER,28);
        LocalDate hj = LocalDate.now();
        Period idade = Period.between(nascimento,hj); // descobrindo a data exata em anos, meses e dias
        System.out.println(idade);

        // Duration - trabalhando com tempo

        Duration ofDays =  Duration.ofDays(2); // criando uma duração de tempo de dois dias, equivalente a 48 horas
        System.out.println(ofDays);

        Duration ofHours = Duration.ofHours(4); // criando um espaço de tempo de 4horas
        System.out.println(ofHours);

        Duration ofMinutes = Duration.ofMinutes(500); // criando um tempo de 500 minutos
        System.out.println(ofMinutes); // observe na saída que ele acumula os minutos e imprime em horas e minutos

        Duration ofSeconds = Duration.ofSeconds(3600); // criando um tempo sm segundos
        System.out.println(ofSeconds); // observe que aqui tbm ele acumula os segundos em minutos/ hora

        LocalTime now = LocalTime.now() ; // criando um tempo agora
        LocalTime periodoQualquer = LocalTime.of(20,10,50); // criando um tempo qualquer
        Duration between1 = Duration.between(now,periodoQualquer); // tirando a diferença
        System.out.println(between1);

        Duration plusMillis = between1.plusMillis(500);
        System.out.println(plusMillis);




    }
}
