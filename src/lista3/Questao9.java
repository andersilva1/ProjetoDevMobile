package lista3;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        int n;
        int d = 0;

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite um numero:");
        n = ent.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                d++;
            }
        }
        
        if (d == 2) {
            System.out.println("O numero é primo!");
        } else {
            System.out.println("O numero não é primo");
        }
    }
}
