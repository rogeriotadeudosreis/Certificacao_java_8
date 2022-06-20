package rinaldo_dev_conteudo_certificacao.funcoes_lambda_Java_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class Java8LambdaRunnable {
    public static void main(String[] args) {

        /*
            Conceitos importantes sobre funções lambda no Java 8

            Primeiro:
            - só é possível criar uma expressão lambda com interfaces que o conceito SAM, Single Abstract Method,
            ou seja, interfaces que possuem apenas um método abstract

            Segundo:
            - A anotação @FunctionInterface informa que a tal interface é uma interface SAM, isso é importante, porque
            nos ajuda saber se tal interface pode ser uma candidata para conversão em lambda ou não.

            Terceiro:
            - Outro objetivo do porque expressões lambda no Java 8
            - API DE STREAM,
            - stream - fluxo de dados

         */

        // Java 8: Funções Lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
//                System.out.println("Certificação Java 7");
            }
        }).run();

        // o mesmo código acima com lambda
        new Thread(() -> System.out.println("Certificacao Java 8 - Lambda")).run();

        // outro exemplo
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Certificação Java 7");
            }
        });

        // agora com lambda
        JButton jButton = new JButton();
        jButton.addActionListener(e -> System.out.println("Certificação Java 8 Lambda"));

        // SAM - Single Abstract Method
        // Conceito da interface ter apenas um método.

        // API DE STREAM
        // stream - fluxo de dados
        // até Java 7
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        for (Integer integer : asList) {
//            System.out.println(integer);
        }

        // a partir do Java 8, podemos contar com uma infinidade de métodos da api stream
        List<Integer> asList2 = Arrays.asList(1, 2, 3, 4);
        asList2.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));

    }
}
