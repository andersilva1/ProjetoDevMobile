package lista3;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        int num;

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite um numero:");
        num = ent.nextInt();

        for (int i = 1; i <= num; i++) {
            int divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    ++divisor;
                }
            }
            if (divisor == 2) {
                System.out.println("Os numeros primos são: " + i);
            }
        }
    }
}