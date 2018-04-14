package lista3;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        int p = 0;
        
        Scanner ent = new Scanner(System.in);
        
        while(num < 1000){
            System.out.println("Digite um numero");
            num = ent.nextInt();
            
            if (num % 2 == 0) {
                p = p + num;
            }else{
                i = i + num;
            }
        }
        
        System.out.println("A soma dos valores par são: "+p);
        System.out.println("A soma dos valores impar são: "+i);
    }
}
