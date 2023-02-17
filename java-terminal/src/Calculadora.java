/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));
      
    }
}