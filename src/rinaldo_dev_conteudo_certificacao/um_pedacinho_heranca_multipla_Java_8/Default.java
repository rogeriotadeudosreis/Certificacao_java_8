package rinaldo_dev_conteudo_certificacao.um_pedacinho_heranca_multipla_Java_8;

/*
    JAVA 8: métodos default em interfaces

    - Até o Java 7, todo método dentro de uma interface, deve ser implementado, consequentemente, classes que implementam
    essa interface, deve implementar o método.
    - Se vc incluir novos métodos nesta interface, também deve ser refatorado todas as classes que implementam esta
    interface.
    - Todos métodos de interfaces são públicos e abstrados (implicitamente, ainda que eu não declare explicitamente).
    Exemplo de sintaxe: void correr(); implicitamente é: public abstract void correr();

    Qual a novidade então ?
    No Java 8, podemos criar métodos com a palavra reservada default, ou seja, o método continua sendo público, porém
    deixa de ser abstract, devendo o mesmo ser implementado.
    Exemplo de sintaxe: default void correrRapido(); implicitamente é: public default void correrRapido();

    - Notas importantes:

     - ao colocar default, vc tira a obrigatoriedade das classes que implementam tal interface de implementar tal método.
     - porém, o método dentro da interface, deixa de ser abstract e automaticamente obrigatório ser implementado
     e ao mesmo tempo podendo tbm ser sobrescrito (@Override) caso chamado dentro de classes que o
     implementam.

     Parece estranho neh ? porque até o Java 7, em interfaces, métodos não tinham implementação, mas agora com o Java 8,
     com a expressão default, é possível sim implementar um método dentro da interface. Show

      - RESSALVAS SOBRE USAR MÉTODOS DEFAULT EM INTERFACES:

      - primeira:

      Supomos que temos duas interfaces: interface Piloto() e interfade Corredor()...
      Ambas possuem o mesmo método: default void correr(); e aí ?

      Quando por exemplo uma classe Pessoa implements Piloto, Corredor {
        // qual dos métodos ela irá chamar ? da interface Piloto ou Corredor ?
        // o Java não sabe decidir isso sozinho, eu preciso informar qual quero implementar ou sobrescrever...
        // pra resolver esse conflito, sou obrigado a implementar informando qual chamar, por exemplo:
        // Corredor.super.correr(); usando a implementação padrão do método da interface, ou sobrescrevendo com
        minha própria implementação.
        // Piloto.super.correr(); também usando a implementação padrão do método da interface Piloto ou sobrescrevendo
        com minha própria implementação.
      }

      - segunda:

      um outro cenário, supomos que a class Pessoa implements Piloto{}

      e a interface Piloto extends Corredor{}

      a interface Piloto pode manter o método da interface Corredor, mas também pode sobrescrever, logo a classe que
      implementar a interface Piloto, irá usar o método determinado pela interface Piloto.

      - terceira:

      Quando usamos a sintaxe static class Pessoa imlements Corredor, Piloto {}, estamos tendo aqui um tipo de herança
      múltipla, pois temos acesso aos métodos de duas interfaces.



 */
public class Default {
    public static void main(String[] args) {
        new Pessoa().correr();
        new Piloto().correr();
        new Avestruz().correr();
        new Avestruz().correrRapido();

    }

    interface Corredor {
        void correr();

        default void correrRapido() {
            System.out.println("Correndo rápido.");
        }
    }

    static class Pessoa implements Corredor {
        @Override
        public void correr() {
            System.out.println("People correndo");
        }
    }

    static class Piloto implements Corredor {
        @Override
        public void correr() {
            System.out.println("Piloto correndo");
        }
    }

    static class Avestruz implements Corredor {
        @Override
        public void correr() {
            System.out.println("Avestruz correndo");
        }

        @Override
        public void correrRapido() {
            System.out.println("Avestruz correndo mais rápido ainda.");
        }
    }
}
