package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao3 {
    
    public static void main(String[] args) {
        
        double altura;
        double raio;
        double volume;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("#.00");
        
        System.out.println("Digite a altura: ");
        altura=sc.nextDouble();
        
        System.out.println("Digite o raio: ");
        raio=sc.nextDouble();
        
        volume = 3.1416 * (raio*raio) * altura;
        
        System.out.println("O volume é: " + ft.format(volume));
    }
}
