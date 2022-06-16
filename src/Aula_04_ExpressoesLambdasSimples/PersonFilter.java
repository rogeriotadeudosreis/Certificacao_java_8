package Aula_04_ExpressoesLambdasSimples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonFilter {
    List<Person> filter(List<Person> all, Predicate<Person> predicate) {
        List<Person> result = new ArrayList<>();
        for (Person p : all) {
            if (predicate.test(p))
                result.add(p);
        }
        return result;
    }
}
