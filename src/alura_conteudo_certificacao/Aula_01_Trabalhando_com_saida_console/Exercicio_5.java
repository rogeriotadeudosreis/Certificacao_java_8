package alura_conteudo_certificacao.Aula_01_Trabalhando_com_saida_console;

public class Exercicio_5 {
    public static void main(String[] args) {
        System.out.println(new char[]{'a', 'b', 'c'}); // A
        System.out.println(new byte[]{'a', 'b', 'c'}); // B, new byte é uma classe e como não foi definido toString não
        // compila
        System.out.println("abc"); // C
        System.out.println(new String[]{"abc"}); // D, new String também não foi configurado o toString, por isso não
        //        compila
    }
}
