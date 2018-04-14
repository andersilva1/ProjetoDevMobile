package lista2;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        double num1;
        double num2;
        double num3;
        double result;
        String opcao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primero numero:");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextDouble();
        System.out.println("Digite o terceito numero");
        num3 = sc.nextDouble();
        
        System.out.println("Escolha s para soma; m para multiplicação; me para media");
        sc = new Scanner(System.in);
        opcao = sc.nextLine();

        switch (opcao) {
            case "s":
                result = num1 + num2 + num3;
                System.out.println("A soma é: " + result);
                break;
            case "m":
                result = num1 * num2 * num3;
                System.out.println("A multiplicacao é: " + result);
                break;
            case "me":
                result = (num1 + num2 + num3) / 3;
                System.out.println("A media é: " + result);
                break;
        }
    }

}
