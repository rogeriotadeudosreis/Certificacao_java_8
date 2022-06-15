package Aula_04_ExpressoesLambdasSimples;

public class Pessoa {
    String name;
    int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
