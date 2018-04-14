package lista2;

import java.util.Scanner;

public class Questao1 {
    
    public static void main(String[] args){
        
        int x;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        x = sc.nextInt();
        
        if (x < 0) {
            System.out.println("Numero negativo");
        }else{
            System.out.println("Numero positivo");
        }if (x % 2 == 0){
            System.out.println("Numero par");
        }else{
            System.out.println("Numero impar");
        }
    }
    
}
