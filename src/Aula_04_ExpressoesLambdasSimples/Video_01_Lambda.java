package Aula_04_ExpressoesLambdasSimples;

import java.util.Arrays;
import java.util.List;

public class Video_01_Lambda {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Mario", 31),
                new Pessoa("Guilherme", 32),
                new Pessoa("Lucas", 17),
                new Pessoa("Alex", 15));

        FiltradorDePessoas filtrador = new FiltradorDePessoas();
        List<Pessoa> result = filtrador.filtra(pessoas, new MariosDeIdade());
        System.out.println(result);
    }
}
