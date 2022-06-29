package udemy_conteudo_curso;

public class MetodosEncapsulamento {
    public static void zerar(int a){
        a = 0;
    }

    public static void zerar(int[] a){
        a[1] = 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 1};
//        System.out.println(a[0]);
        zerar(a[0]);
        zerar(a);
//        System.out.println(a[0]);
//        System.out.println(a[1]);
    }
}
