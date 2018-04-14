package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Questao5 {
    
    public static void main(String[] args){
        int num;
        int exp;
        double result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        System.out.println("Digite um expoente: ");
        exp = sc.nextInt();
        
        result = Math.pow(num,exp);
        System.out.println("O número: " + num + " elevado ao expoente: " + exp + " é igual a: " + result);
    }
    
}
