public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //A estrutura padrão para se declarar uma variável sempre é:
        //<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
        //Estudar tipos primitivos
        //Estudar a classe String que representa texo na aplicação
        //String meuNome = "Berenice"

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        //inserir quebra de linha
        double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 10.75;
        
        System.out.print(VALOR_DE_PI);

        //inserir outra quebra de linha
        final double NOTA = 3.14;
       // NOTA = 10.75; não pode ser alterado pq "final" + nome da variável em caixa alta trava 
       //para não sofrer alteração

        System.out.print(NOTA);
    }
}
