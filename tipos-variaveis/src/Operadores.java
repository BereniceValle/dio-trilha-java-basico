public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        //classe Operadores.java
            int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);
        //incrementando numero em mais 1 numero, imprime 6
            numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        int a, b;

        a = 6;
        b = 7;

        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";*/

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean sinNao = numero1 == numero2;

        System.out.println("numeroUm é igaul a numeroDois? " + sinNao);

        sinNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + sinNao);

        sinNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + sinNao);

        sinNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + sinNao);

        //Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeiras");
        }
        System.out.println("Fim");
    }
}
    

