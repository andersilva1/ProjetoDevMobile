package lista2;

import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args){
        int l1;
        int l2;
        int l3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro lado: ");
        l1=sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        l2=sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        l3=sc.nextInt();
        
        if (l1 + l2 > l3) {
            System.out.println("Forma um triângulo!");
        }else{
            System.out.println("Não forma um triângulo!");
            // O algoritmo deve parar aqui! Se não formar um triangulo
        }if (l1 == l2 && l1 == l3){
            System.out.println("Triangulo Equilatero!");
        }else if (l1 == l2 || l1 == l3){
            System.out.println("Triangulo Isoceles!");
        }else{
            System.out.println("Triangulo Escaleno!");
        }
    }
}
