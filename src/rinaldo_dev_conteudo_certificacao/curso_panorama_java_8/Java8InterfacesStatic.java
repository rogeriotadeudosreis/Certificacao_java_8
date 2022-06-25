package rinaldo_dev_conteudo_certificacao.curso_panorama_java_8;

import java.util.Collections;

// Java 8 métodos STATIC em interfaces
public class Java8InterfacesStatic {
    public static void main(String[] args) {

        System.out.println(Corredor.calcularVelocidade(8.0, 2.0));

        // NÃO COMPILA - a classe Pessoa não possui o método calculeVelocidade
//        double velocidade = Person.calculeVelocidade(5.0, 10.0);
//        System.out.println(velocidade);

        // NÃO COMPILA - o objeto instância de Pessoa não possui o método calculeVelocidade
//        double velocidade2 = new Person().calculeVelocidade(5.0, 10.0);
//        System.out.println(velocidade2);
    }

    interface Corredor {
        static double calcularVelocidade(double distancia, double tempo) {
            return distancia / tempo;
        }
    }

    class Person implements Corredor {

    }

}
