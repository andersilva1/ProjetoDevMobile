package lista2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao3 {
    
    public static void main(String[] args){
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("#.00");
         
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextDouble();
        
        if (nota1 > nota2 && nota1 > nota3) {
            System.out.println("O maior valor é da nota 1: " + nota1);
        } else if (nota2 > nota1 && nota2 > nota3) { 
            System.out.println("O maior valor é da nota 2: " + nota2);
        }else{
            System.out.println("O maior valor é da nota 3: "  + nota3);
        }
        
        System.out.println("Calculando a media...");
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media das notas é: " + ft.format(media));
    }
}
