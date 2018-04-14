package lista2;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        String opcao;
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        a = ent.nextInt();
        System.out.println("Digite o segundo valor:");
        b = ent.nextInt();
        System.out.println("Digite o terceito valor:");
        c = ent.nextInt();

        System.out.println("Escolha C ou D");
        ent = new Scanner(System.in);

        opcao = ent.nextLine();

        char opcao2 = opcao.charAt(0);

        switch (opcao2) {
            case 'c':
                if (a < b && b < c) {
                    System.out.println(a + "-" + b + "-" + c);
                } else if (a < c && c < b) {
                    System.out.println(a + "-" + c + "-" + b);
                } else if (b < a && a < c) {
                    System.out.println(b + "-" + a + "-" + c);
                } else if (b < c && c < a) {
                    System.out.println(b + "-" + c + "-" + a);
                } else if (c < a && a < b) {
                    System.out.println(c + "-" + a + "-" + b);
                } else if (c < b && b < a) {
                    System.out.println(c + "-" + b + "-" + a);
                } else {
                    System.out.println("Numeros Iguais");
                }
                break;
            case 'd':

                if (a > b && b > c) {
                    System.out.println(a + "-" + b + "-" + c);
                } else if (a > c && c > b) {
                    System.out.println(a + "-" + c + "-" + b);
                } else if (b > a && a > c) {
                    System.out.println(b + "-" + a + "-" + c);
                } else if (b > c && c > a) {
                    System.out.println(b + "-" + c + "-" + a);
                } else if (c > a && a > b) {
                    System.out.println(c + "-" + a + "-" + b);
                } else if (c > b && b > a) {
                    System.out.println(c + "-" + b + "-" + a);
                } else {
                    System.out.println("Numeros Iguais");
                }
                break;
        }

    }
}
