package lista1;

import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
       
        double grau;
        double conversao;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o grau: ");
        grau=sc.nextDouble();
        
        conversao = (9 * grau + 160)/5;
        System.out.println("O grau em Fahrenheit é: " + conversao);
    }
}
