package rinaldo_dev_conteudo_certificacao.streams_java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Streams {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        // Iteração no Java 4:
        for (Iterator iterator = lista.iterator(); iterator.hasNext(); ) {
            Integer integer = (Integer) iterator.next();
//            System.out.println(integer);
        }

        // Iteração no Java 5:
        for (Integer integer : lista) {
//            System.out.println(integer);
        }

        // Iteração no Java 8 com lambda:
        // stream = fluxo de dados
        List<Integer> listaAlterada = new ArrayList<>();
                 lista.stream()
                // .skip(2) // ignora os dois primeiros itens da lista
                // .limit(2) // limita o número de elemtos a serem iterados
                 .distinct() // ele usa equals hascode, não processa elementos repetidos
//                .filter(e -> e % 2 == 0) // filtra a lista com uma determinada regra
                .map(e -> e * 2) // a lista original não é modificada
                .forEach(e -> listaAlterada.add(e) );

        System.out.println(listaAlterada);

    }
}
