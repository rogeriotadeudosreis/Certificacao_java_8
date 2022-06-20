package alura_conteudo_certificacao.Aula_04_ExpressoesLambdasSimples;

import java.util.function.Predicate;

public class AgeOfMajority implements Predicate<Person> {
    @Override
    public boolean test(Person pessoa) {
        return pessoa.getAge() >= 18;
    }
}
