package Aula_04_ExpressoesLambdasSimples;

import java.util.ArrayList;
import java.util.List;

public class FiltradorDePessoas {
    List<Pessoa> filtra(List<Pessoa> todas, Matcher<Pessoa> matcher) {
        List<Pessoa> result = new ArrayList<>();
        for (Pessoa p : todas) {
            if (matcher.test(p))
                result.add(p);
        }
        return result;
    }
}
