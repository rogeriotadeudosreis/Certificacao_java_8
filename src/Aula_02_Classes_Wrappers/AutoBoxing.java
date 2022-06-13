package Aula_02_Classes_Wrappers;

public class AutoBoxing {
    static long i;

    public static void main(String[] args) {

        // Java 1.4
        Integer intWrapper = Integer.valueOf(1);
        int intPrimitivo = intWrapper.intValue();
        intPrimitivo++;
        intWrapper = Integer.valueOf(intPrimitivo);

        // Java 5
        // Auto/boxing converter primitivo para wrapper ou vice versa de forma automatica
        Integer intWrapperJ5 = Integer.valueOf(1);
        intWrapperJ5++;

        i = Integer.valueOf("10", 8); // A
        m1(i); // B esta linha não compila, pois i é long tentando converter para Integer
    }

    private static void m1(Integer j) { // C
        System.out.println(j);
    }
}
