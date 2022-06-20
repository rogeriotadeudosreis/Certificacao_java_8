package alura_conteudo_certificacao.Aula_02_Classes_Wrappers;

/*
::Wrappers:: são classes de objetos que representam tipos primitivos. Existe um
 ::wrapper:: para cada primitivo, conforme a lista abaixo:

boolean = Boolean
byte = Byte
short = Short
int = Integer
char = Character
long = Long
double = Double
float = Float
 */

public class ClassesWrappers {

    public static void main(String[] args) {

        Double d1 = new Double(49.5);
        Double d2 = new Double("49.5");
        Double d3 = new Double("49.5");

        Character ch = new Character('a');

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true"); // true
        Boolean b3 = new Boolean("True"); // true
        Boolean b4 = new Boolean("TrUe"); // true
        Boolean b5 = new Boolean("TRUE"); // true
        Boolean b6 = new Boolean("verdadeiro"); // false
        Boolean b7 = new Boolean("true "); // false

        // wrapper => primitivos

        // esses métodos convertem um wrapper em primitivos
        // xxxValue -> todos os métodos que convertem um wrapper para primitivos seguem esta convenção
        Long l = new Long("123");

        long l1 = l.longValue();
        int i = l.intValue();
        double d = l.doubleValue();

        boolean b = new Boolean("T").booleanValue(); // Boolean somente convertem para o tipo boolean mesmo
        char c = new Character('a').charValue(); // Char somente convertem para o tipo char mesmo
        System.out.printf("%d %d %.2f", l1, i, d);

        // String -> converter para primitivo
        // parseXXX
        String string = new String(("123.6"));
        double d20 = Double.parseDouble(string);
        int i20 = Integer.parseInt("123123");
        int base10 = Integer.parseInt("1100", 10);
        int base16 = Integer.parseInt("1100", 16);
        int base = Integer.parseInt("A", 16);
        long base17 = Long.parseLong("11", 2);

        // String -> wrapper
        // construtor
        // valueOf

        Double d30 = new Double("23.7");
        Double d31 = Double.valueOf("23.7");
        Integer i30 = Integer.valueOf("23");
        Integer i31 = Integer.valueOf("5AF", 16);

        // primitivo para String
        // toString
        String d40 = Double.toString(24.6);
        String d41 = Integer.toString(123, 10);

        //wrapper para String
        // toString


    }
}
