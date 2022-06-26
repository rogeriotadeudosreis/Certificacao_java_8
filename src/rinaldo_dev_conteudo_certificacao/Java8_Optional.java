package rinaldo_dev_conteudo_certificacao;

/*
        Optional, é uma excelente opção criado em java 8 para retorno de métodos, evitando retorno de exceções
        Se o retorno de um determinado método é válido, retorna o valor, senão, retorna o que vc configurou com
        as opções de métodos da classe Optional. Vejamos os principais abaixo;

        isPresent() - verifica se determinado valor é presente, mas ainda assim retorna uma exceção
        get()       - obtém o valor retornado pelo método
        ifPresent() - numero.ifPresent(n -> sout(n)); aqui permite executar uma expressão lambda,
         se houver um valor retornado,
        uma função é executada
        orElse(2)   - aqui se tiver um valor retorna, senão, podemos retornar um valor default como parametro
        orElseGet() - numero.orElseGet(() -> 5); aqui também podemos executar uma expressão lambda
        orElseThrow() - numero.orElseThrow(() -> new NullpointerException()); sout(...)
         */

import java.util.Optional;

public class Java8_Optional {
    public static void main(String[] args) {

        // até java 7
        String numeroStr = "1";
//        String numeroStr = "Rogério";
//        Integer numeroConvertido = converterNumero(numeroStr).orElseGet(() -> 345); // pode fazer uma operacaoPesada()
        Integer numeroConvertido = converterNumero(numeroStr).orElseThrow(() -> new NullPointerException("valor vazio")); // pode fazer uma operacaoPesada()
        System.out.println(numeroConvertido);
//        numeroConvertido.ifPresent(n -> System.out.println(n * 5));

    }

    public static Optional<Integer> converterNumero(String numeroStr) {
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        }catch (Exception e ){
            return Optional.empty();
        }

    }
}
