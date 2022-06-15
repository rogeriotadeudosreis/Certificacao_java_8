package Aula_04_ExpressoesLambdasSimples;

public class MariosDeIdade implements Matcher<Pessoa> {
    @Override
    public boolean test(Pessoa pessoa) {
        return pessoa.age >= 18;
    }
}
