package lista3;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int i;

        int soma = 0;
        int produto = 0;
        double media = 0;

        Scanner ent = new Scanner(System.in);

        for (i = 0; i <= 0; i++) {
            System.out.println("Digite 3 valores");
            a = ent.nextInt();
            b = ent.nextInt();
            c = ent.nextInt();

            if (a > b && b > c) {
                break;
            }

            soma = a + b + c;
            produto = a * b * c;
            media = (a + b + c) / 3;

            System.out.println("A soma dos numeros é: " + soma);
            System.out.println("A multiplicação dos numeros é: " + produto);
            System.out.println("A media dos numeros é: " + media);
        }
    }
}
