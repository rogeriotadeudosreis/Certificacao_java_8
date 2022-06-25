package rinaldo_dev_conteudo_certificacao.streams_java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamsParte2 {

    public static void main(String[] args) {

        /*
        streams em Java 8
        veremos aqui alguns exemplos da facilidade de usar streams
        lembrando, streams, são fluxo de dados, onde vc pode ter
        várias operações intermediárias e finais
         */

        List<Integer> lista = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3, 4, 6, 5, 3);
        lista.stream()
                .skip(2) // aqui ignoramos os dois primeiros itens da lista
                .limit(5) // aqui limitamos os itens da lista em apenas 5 itens a serem processados
                .distinct() // aqui semelhante ao distinct do SQL, ignoramos itens iguais
                .filter(item -> item % 2 == 0) // aqui pegamos apenas os números pares
                .map(item -> item * 2) // aqui multiplicamos os itens filtrados por 2
                .forEach(item -> System.out.print(item + " ")); // aqui método final ou terminal, imprimimos o resultado

    /*
    Agora trabalharemos com operações finais ou terminais no streams Java 8
    Ex:
    max - retorna o maior número encontrado na lista
    min - retorna o menor número da lista
    count - conta quantos itens ou elementos da lista foram processados
    collect(collectors.toList()) - coleta o resultado do processamento
    groupingBy( e -> e == 0) - agrupa o resultado conforme critério criado
    joining(....) - agrupa todas as strings em apenas uma, com opção de separadores

    Importante ressaltar que quando trabalhamos com métodos finais ou terminais
    somos obrigados a armazenar o resultado em uma nova lista, conforme veremos abaixo
     */

        List<Integer> list2 = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3);
        Optional<Integer> novaLista = list2.stream() // usamos um optional para receber a nova lista, pois pode haver exceções
                .map(item -> item * 2) // transformando o item, multiplicando por 2
                .max(Comparator.naturalOrder()); // usando o método comprator para pegar o maior item processado
        System.out.print("\nMaior item da lista: " + novaLista.get());

        List<Integer> list3 = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3);
        Optional<Integer> novaLista3 = list3.stream()
                .map(item -> item * 3)
                .min(Comparator.naturalOrder());
        System.out.print("\nMenor item da lista: " + novaLista3.get());

        List<Integer> lista4 = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3);
        long novaLista4 = lista4.stream()
                .filter(e -> e % 3 == 0) // filtrando aqui os numeros primos
                .map(e -> e * 2) // transformando os items dalista, multiplicando por 2
                .count(); // aqui podemos contar quantos elementos foram processados
        System.out.print("\nQuantos itens da lista foram processados: " + novaLista4);

        /*
        observação importante:
        sempre que fazemos operações com métodos finais ou terminais, precisamos armazenar o resultado do processamento
        em uma variável, do tipo do resultado, por ex: boolean, optional, Integer, long, etc...
         */
        List<Integer> lista5 = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3);
        // usando collect, como nome já diz, a classe Collect, usa métodos para coletar o resultado e criar uma nova lista

        List<Integer> novaLista5 = lista5.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 10)
                .distinct()
                .collect(Collectors.toList());
        System.out.print("\nColetando o resultado com collectors: " + novaLista5);

        // Agora usando outro método final, groupingBy
        List<Integer> lista6 = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3);
        Map<Boolean, List<Integer>> mapa = lista6.stream()
                .map(e -> e * 2)
                .collect(Collectors.groupingBy(e -> e > 6));
        System.out.print("\nAgrupando o resultado com collectors: " + mapa);

        // Agora usando joining, onde podemos reunir várias strings em uma única string
        List<Integer> lista7 = Arrays.asList(1, 3, 2, 5, 6, 9, 8, 7, 8, 3);
        String string = lista7.stream()
                .filter(e -> e > 6)
                .map(e -> String.valueOf(e))
                .sorted()
                .distinct()
                .collect(Collectors.joining("/"));
        System.out.print("\nAgrupando várias strings em uma única string com collectors: " + string);




    }
}
