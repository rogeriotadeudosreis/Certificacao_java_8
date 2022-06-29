package udemy_conteudo_curso;

public class Cachorro {

    private Cachorro(char nome) {
        System.out.println(nome);
    }

    Cachorro() {
        System.out.println("Desconhecido");
    }

    public class Main {
//         Cachorro c =  new Cachorro("Pastor Alemão"); // --> esse construtor que pode ser dado new é sem parametros
        // dando erro de compilação
    }
}
