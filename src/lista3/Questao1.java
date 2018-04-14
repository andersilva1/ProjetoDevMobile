package lista3;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        int num;
        int maior;
        int menor;
        int i;

        maior = 0;
        menor = 100;

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite 15 valores:");
        
        for (i = 0; i < 15; i++) {
            num = ent.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("O menor numero digitado foi: " + menor);
    }
}
