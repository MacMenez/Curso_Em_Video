/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author asimov
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* OPERADORES ARITMÉDTICOS */
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1+n2)/2;
        System.out.println("Média é:" + media);
        
        media = n1+n2/2;
        System.out.println("Média é:" + media);
        
        int numero = 5;
        numero++;
        System.out.println(numero);
        
        numero = 9;
        numero--;
        System.out.println(numero);
        
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);
        
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        
        int numero = 10;
        int valor = 4 + --numero;
        System.out.println(valor);
        System.out.println(numero);
        
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        
        float valor = 8.5f;
        int valorArredondado = (int) Math.floor(valor); // Arredondando para baixo e forçando o tipo inteiro
        System.out.println(valorArredondado);
        
        int valorArredondado = (int) Math.ceil(valor);// Arredondando para cima e forçando o tipo inteiro
        System.out.println(valorArredondado);
        
        int valorArredondado = (int) Math.round(valor);// Arredondando aritmético forçando o tipo inteiro
        System.out.println(valorArredondado);
        
        double numeroAleatorio = Math.random();
        System.out.println(numeroAleatorio);*/
        
        int valorMinimo = 15, valorMaximo = 50;
        double numeroAleatorio = Math.random();
        
        int valor = (int) (valorMinimo + numeroAleatorio * (valorMaximo - valorMinimo));
        System.out.println(valor);
    }
    
}
