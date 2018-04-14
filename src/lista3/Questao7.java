package lista3;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        double media;
        double maior = 0;
        double menor = 100;
        double me = 0;
        int i;
       
        Scanner ent = new Scanner(System.in);
        
        for (i = 0; i <= 10; i++) {
            System.out.println("Digite as medias:");
            media = ent.nextDouble();
            if (media < 0) {
                System.out.println("Programa finalizado");
                break;
            }
            if (media > maior) {
                maior = media;
            }
            if (media < menor) {
                menor = media;
            }
            me = (media + i) / i;
        }
        System.out.println("A maior media é: " + maior);
        System.out.println("A menor media é: " + menor);
        System.out.println("A media aritimedica é: " + me);
    }
}
