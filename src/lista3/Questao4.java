package lista3;

public class Questao4 {
    public static void main(String[] args) {
        int i;
        
        for (i = 1000; i < 2000; i++) {
            if (i % 11 == 5) {
                System.out.println("Numero "+i+" é divisivel por 11");
            }else{
                System.out.println("Numero "+i+" não divisivel por 11");
            }
        }
    }
}
