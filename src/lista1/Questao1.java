package lista1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        
        double num1;
        double num2;
        double result;
 
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Entre com o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Entre com o segundo número: ");
        num2 = sc.nextDouble();
        
        result=num1+num2;
        System.out.println("Soma: " + result);
        
        result=num1-num2;
        System.out.println("Diferença: " + result);
        
        result=num1*num2;
        System.out.println("Produto: " + result);
        
        if (num2 != 0) {
            result=num1/num2;
            System.out.println("Media: " + result);
        }else{
            System.out.println("O segundo número não pode receber 0. Favor digitar outro.");
        }
    }
    
}
