package Aula_05_Independencia_de_plataforma_OO_Encapsulamento;

/*
Conceitos importantes sobre a importância de usar Java
Neste exemplo estudaremos a importância do encapsulamento
 */

public class Video_01_Person {

    private String nome;
    private String sobrenome;

    public Video_01_Person(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
