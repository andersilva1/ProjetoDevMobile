package projeto;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        // Declarando as variaveis universais 
        int opcao1, 
            opcao,
            idade = 0,
            somaIdade = 0,
            countFem = 0,
            somaFem = 0,
            somaMasc = 0,
            countMasc = 0,
            countQtde = 0,
            idadeMasc = 0,
            idadeFem = 0,
            num,
            somaPrimo = 0;
        double num1;
        double num2;
        double result;
        String sexo;

        // Declarando a variavel de atribuíção
        Scanner ent = new Scanner(System.in);

        //Menu principal
        //O usuário irá escolher uma dessas opções:
        System.out.println("Escolha uma das opções:");
        do {
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Faixa etária");
            System.out.println("5. Números primos");
            System.out.println("6. Mudança de base");
            System.out.println("7. Sair");

            ent = new Scanner(System.in);
            opcao = ent.nextInt();

            switch (opcao) {

                //Para a opção 1, o programa irá executar a soma de dois valores
                case 1:
                    //Recebendo os valores digitado pela usuário para as variaveis num1 e num2
                    System.out.println("Digite o primeiro numero:");
                    num1 = ent.nextDouble();

                    System.out.println("Digite o segundo numero:");
                    num2 = ent.nextDouble();

                    result = num1 + num2;
                    //Imprimindo o resultado da soma das variaveis
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                    
                //Para a opção 2, o programa irá executar a subtração de dois valores
                case 2:
                    //Recebendo os valores digitado pela usuário para as variaveis num1 e num2
                    System.out.println("Digite o primeiro numero:");
                    num1 = ent.nextDouble();

                    System.out.println("Digite o segundo numero:");
                    num2 = ent.nextDouble();

                    result = num1 - num2;
                    //Imprimindo o resultado da subtração das variaveis
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                //Para a opção 3, o programa irá executar a divisão de dois valores
                case 3:
                    //Recebendo os valores digitado pela usuário para as variaveis num1 e num2
                    System.out.println("Digite o primeiro numero:");
                    num1 = ent.nextDouble();

                    System.out.println("Digite o segundo numero:");
                    num2 = ent.nextDouble();

                    if (num2 != 0) {
                        /*Neste bloco de execução, o código iriá identificar se o numero da segunda variavel é 0.
                    Se não for ele executará a divisão, se for ele retornará uma mensagem de alerta.*/
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Impossivel divisão por 0 (zero)!");
                    }
                    break;
                    
                //Para a opção 4, o programa irá executar a soma e media da faixa etaria de algumas pessoas
                case 4:
                    //Para sair da estrutura de repetição o usuário deverá digitar uma idade menor do que zero
                    while (idade >= 0) {
                        System.out.println("Digite uma idade:");
                        idade = ent.nextInt();
                        
                        //Inicializando novamente o valor da variavel de entrada de dados
                        ent = new Scanner(System.in);
                        
                        // A variavel "sexo" vai receber apenas os valores F e M
                        System.out.println("Digite o sexo, M para masculino e F para feminino:");
                        sexo = ent.nextLine();
                        
                        //Toda vez que o usuário digitar o valor da idade, a variavel "countQtde" vai ser incrementada
                        //E haverá a soma de todas as idades digitadas pelo usuário
                        if (idade >= 0) {
                            countQtde++;
                            somaIdade = idade + somaIdade;
                        }
                        
                        //Nos blocos de execuções seguintes, o valor da variavel "sexo" vão ser testados
                        /*Toda vez que o usuário digitar M, haverá um acréscimo na variavel "countMasc",
                        fará a soma das idades do sexo masculino e a retirar a media das idades*/
                        if ("M".equals(sexo)) {
                            countMasc++;
                            somaMasc = somaMasc + idade;
                            idadeMasc = somaMasc / countMasc;
                        }
                        
                        //Este bloco seguirá o mesmo raciocinio do anterior
                        if ("F".equals(sexo)) {
                            countFem++;
                            somaFem = somaFem + idade;
                            idadeFem = somaFem / countFem;
                        }
                        
                        //Nesta etapa, irá apresentar os valores das médias de todas as idades
                        //Média do sexo masculino e feminino
                        result = somaIdade / countQtde;
                        System.out.println("A media de idade é: " + result);
                        System.out.println("A media do sexo masculino é: " + idadeMasc);
                        System.out.println("A media do sexo femino é: " + idadeFem);
                    };
                    break;
                    
                //Para a opção 5, o programa irá executar o cálculos de numeros primos
                case 5:
                    System.out.println("Digite um número:");
                    num = ent.nextInt();
                    
                    /*Nesta estrutura de repetição, apresentará todos os valores de numeros primos,
                    até o numero digitado pelo usuário*/
                    for (int i = 1; i <= num; i++) {
                        int divisor = 0;
                        for (int j = 1; j <= i; j++) { //Estrutura responsável por validar se o numero é primo ou não. Se for, a variavel "divisor" será acrescentada 1 valor
                            if (i % j == 0) {
                                ++divisor;
                            }
                        }
                        if (divisor == 2) { //Condição responsável por somar os valores primos dentro do intervalo
                            somaPrimo = i + somaPrimo;
                        }
                    }
                    
                    //Apresentando a soma dos valores de numeros primos até o digitado pelo usuário
                    System.out.println("A soma é: " + somaPrimo);
                    break;
                    
                //Para a opção 6, o programa irá executar a mudança de base de um numero
                case 6:
                    do {
                        System.out.println("Escolha 1 para converter numero binário em decimal:");
                        System.out.println("Escolha 2 para converter numero decimal em binario:");

                        ent = new Scanner(System.in);
                        opcao1 = ent.nextInt();
                        
                        //Haverá duas opções para serem escolhidas, 1 para converter numero binário em decimal.
                        //E 2 para converter numero decimal em binario.
                        switch (opcao1) { //Aqui será feito a conversão de binario para decimal
                            case 1:
                                System.out.println("Digite o valor em binario:"); //O valores em binarios, devem ser em string
                                String entrada = ent.next();
                                //Declarando as variáveis para fazer o cálculo
                                int potencia = 0;
                                int decimal = 0;
                                
                                /*Nesta estrutura, o valor de i será igual ao primeiro caracter da direita para esquerda
                                Deverá ser maior que 0 e será descrecentada um unidade*/
                                
                                for (int i = entrada.length() - 1; i >= 0; i--) {
                                    /*A cada iteração, o valor da variavel "decimal" receberá o valor exponencial
                                    da variavel "potencia" ao quadrado
                                    Multiplicado pelo valor digitado em binario pelo usuário.*/
                                    decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                                    potencia++;
                                }
                                //Imprimindo o valor da conversão
                                System.out.println("O numero informado em decimal é: " + decimal);
                                break;
                            case 2:
                                //As variaveis serão uam para receber o valor do decimal,
                                //uma para fazer a divisão
                                //e outra para receber o valor de binário
                                int dec,
                                 mod;
                                String bin = "";
                                System.out.println("Digite um numero em decimal:");
                                dec = ent.nextInt();

                                while (dec > 0) {
                                    mod = (dec % 2); //Primeiro, será recuperado o valor do resto da divisão do valor em decimal por 2
                                    bin = mod + bin; //Após isso, a variavel "bin" receberá o valor o resto da divisão
                                    dec = dec / 2; //E por fim, a variavel "dec", será dividida por 2
                                }
                                //Será imprimido o valor da variavel bin
                                System.out.println("O valor do numero informado em binario é: " + bin);
                                break;
                        } //Para sair da estrutura de repetição, o usuário deverá escolher um numero diferente de 3
                    } while (opcao1 != 3);
                    break;
                //Caso o usuário digite 7, o programa irá finalizar
            }
        } while (opcao != 7);
        System.out.println("Programa Finalizado!");
    }
}