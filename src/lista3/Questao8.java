package lista3;

import java.util.Scanner;

class Questao8 {

    public static void main(String[] args) {
        int n;
        int i;
        int j;

        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digte um numero: ");
        n = ent.nextInt();
        
        for (i = n, j = n; i < 100; i += 2, j += 2) {
            if (n % 2 == 0) {
                System.out.println("Os numeros pares são: " + i);
            }else{
                System.out.println("Os numeros impares são: " + j);
            }
        }
    }
}
