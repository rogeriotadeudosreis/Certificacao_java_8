package udemy_conteudo_curso;

public class Testes {

//    static Double a;
//    static double b;

    public static void main(String[] args) {
        Integer a1 = new Integer("1");
        Integer a2 = Integer.valueOf("2");
        Integer a3 = Integer.decode("3");
//        System.out.println(a1 + a2 + a3);

//        a = 4.0;
//        b = 2;
//        System.out.println(a*b);

        // declaração inválida
//        float a = 0 * 1.5f; // se tirarmos o f no final da declaração, a mesma se torna inválida
//        System.out.println(a);

        // qual das alternativas é inválida ?

        float aFloat = 100; // aqui somente é necessário o f se for número decimal
        double aDouble = 100;
        char aChar = 100;
        byte aByte = 127; // aqui o valor máximo é 127, passou desse valor, dá erro

        // Operadores e elementos de decisão

        /*
         switch -> o switch aceita como argumento os tipos: byte, short, char, int (e seus wrappers), String e Enum
         não aceita long e boolean
         */
        int as = 1;

        switch (as) {
            case 4:
                System.out.println('1');
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;
        }

        /*
        == vs .equals()

        == -> compara a referência
        .equals() -> compara o conteúdo do objeto
         */
        String a5 = "Javaa", b5 = "Java", c = new String("Java");
//        boolean d = b5 == a5; // true
//        boolean e = b5.equals(a5); // true
//        boolean f = b5 == c; // false
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);

        /*
        if sem chaves, cuidado
        Quando o if não tem chaves, apenas a linha abaixo pertence a ele, as demais não.
         */
        int a = 1; // inicializamos com 1
        if (a == 0) // verificamos se a é igual a 1
            a = 10; // se for verdadeiro a condição do if, esta linha será executada, atribuindo um novo valor ao a
        a++; // incrementamos + 1
        System.out.println(a);


    }
}
