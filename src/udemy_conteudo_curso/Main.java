package udemy_conteudo_curso;

class Cachorro1 extends Animal implements Mamifero {
}

public class Main {
    static Animal an = new Cachorro1(){};
    static Animal a = new Animal();

    public static void main(String[] args) {
        System.out.println(a instanceof Mamifero); // a é uma instancia de mamifero
        System.out.println(a instanceof Cachorro1); // a também é uma instancia de Cachorro1
        System.out.println(a instanceof Animal); // a também é uma instancia de animal
        System.out.println(a.toString()); // a também é uma instancia de animal
    }

}
