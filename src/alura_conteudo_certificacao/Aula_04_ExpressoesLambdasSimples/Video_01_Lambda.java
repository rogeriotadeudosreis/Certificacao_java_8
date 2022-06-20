package alura_conteudo_certificacao.Aula_04_ExpressoesLambdasSimples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Video_01_Lambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mario", 31),
                new Person("Guilherme", 32),
                new Person("Lucas", 17),
                new Person("Alex", 15));

        PersonFilter filter = new PersonFilter();

        Predicate<Person> criterio = new Predicate<Person>() { // esta interface Predicate já existe em java 8
            public boolean test(Person pessoa) {
                return pessoa.getAge() >= 18;
            }
        };

        // convertendo a interface Predicate(exemplo) acima em uma expressão lambda

        Predicate<Person> criterio1 = (Person p) -> {
            return p.getAge() >= 18;
        };

        // aqui abaixo simplicando nosso codigo com o lambda
        Predicate<Person> criterioLambda = p -> p.getAge() >= 18; // nosso código limpo

        // como já está declarado o tipo de objeto <Person> do Predicate, não é necessário
        // declarar entre parentes
        // e se também, tiver apenas um parâmetro, não é necessário os parênteses
        // e se dentro das chaves tiver apenas uma linha de código, não é necessário as chaves
        // e se esta única linha de código for o return do método, tbm não é necessário a palavra chave return,
        // enchutando cada vez mais nosso código.
        // e ainda podemos simplificar ainda mais colocando direto dentro da List, conforme abaixo o exemplo.

        // pra ter uma lâmbda precisamos ter uma interface funcional
        // interface funcional -> é uma interface ue tem apenas um método
        // são interfaces fortes candidatas a serem convertidas para um lambda

        List<Person> result = filter.filter(people, criterioLambda);

        List<Person> result2 = filter.filter(people, p -> p.getName().startsWith("G"));

        System.out.println(result);
        System.out.println(result2);

        for( int i = 0; i < 10; i++){
            new Thread(() -> System.out.println(1)).start(); // erro de compilação porque variável referenciado de um
            // lambda deve ser final
        }

        // Regras importantes para lambdas

        // aqui temos uma expressão lambda válida, com dois parametros
//        (String s1, String s2) -> {
//            return null;
//        };

        // aqui também temos uma expressão válida
//        (s1, s2) -> {
//            return null;
//        };

        // aqui quando temos apenas um parametro, não é preciso declará-lo
//        p -> {
//            return null;
//        };

        // Aqui em uma expressão que não recebe nenhum parametro, é obrigatório
        //colocar os parentes vazios
//        Runnable run = () -> {
//            return null;
//        };
    }

    ;
}
