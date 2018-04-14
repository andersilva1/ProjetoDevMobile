package lista1;

import java.util.Scanner;

public class Questao4 {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a=sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b=sc.nextInt();
        
        c = a;
        a = b;
        b = c;
   
        System.out.println("O valor recebido de A é: " + a);
        System.out.println("O valor recebido de B é: " + b);
    }
    
}
