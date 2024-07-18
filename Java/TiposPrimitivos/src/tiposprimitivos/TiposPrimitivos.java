package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        /* COMANDOS DE ENTRADA */
        int valorA = 100; // Números Inteiros
        float valorB = 100.0f; // Números Decimais - nas versões mais novas, colocar o f é opcional
        char valorC = 'D'; // Apenas 1 caractere
        boolean valorD = false; // Valores verdadeiros ou falsos

        System.out.println(
            "ATRIBUIÇÃO 'PADRÃO': \n" +
            valorA + "\n" +
            valorB + "\n" +
            valorC + "\n" +
            valorD
        );

        int valorA1 = (int) 3;
        float valorB1 = (float) 100.0;
        char valorC1 = (char) 'D';
        boolean valorD1 = (boolean) false;

        System.out.println(
            "ATRIBUIÇÃO TYPECAST: \n" +
            valorA1 + "\n" +
            valorB1 + "\n" +
            valorC1 + "\n" +
            valorD1
        );

        
        Integer valorA2 = new Integer(3);
        Float valorB2 = new Float(100.0);
        Character valorC2 = new Character('D');
        Boolean valorD2 = new Boolean(false);

        System.out.println(
            "ATRIBUIÇÃO POR WRAPPER CLASS: \n" +
            valorA2  + "\n" +
            valorB2 + "\n" +
            valorC2 + "\n" +
            valorD2
        );
        

        /* COMANDOS DE SAÍDA */
        float nota = 9.5f;
        System.out.print("Saída 'print'-> Sua nota é: " + nota + "\n");
        System.out.println("Saída 'println'-> Sua nota é: " + nota); // Inserindo uma linha em branco após escrita
        System.out.printf("Saída 'printf'-> Sua nota é %.2f \n", nota); //Saída formatada
        
        String nome = "Davi";
        System.out.printf("Saída 'printf'com 2 tipos -> Sua nota %s é %.2f \n", nome, nota); //Saída formatada
        
        System.out.format("Saída 'format'-> Sua nota %s é %.2f \n", nome, nota); //Saída formatada
        
        /* COMANDOS DE ENTRADA*/
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite nome: ");
        nome = teclado.nextLine(); // Lê um texto
        
        System.out.println("Digite número real: ");
        nota = teclado.nextFloat(); // Lê um número real
        
        System.out.format("Informações da entrada do objeto 'teclado' -> Sua nota %s é %.1f \n", nome, nota); //Saída formatada
    }
}
