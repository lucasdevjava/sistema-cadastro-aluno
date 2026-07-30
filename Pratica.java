import java.util.Scanner;
public class Pratica {
    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite aqui o segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Digite [1] para somar \nDigite [2] para subtrair \nDigite [3] para multiplicação \nDigite [4] para divisão");
        int escolha = sc.nextInt();

            if (escolha == 1) {

                System.out.println(c1.Soma(num1, num2));
                
            }
            else if (escolha == 2) {

                System.out.println(c1.Subtração(num1, num2));

            }
            else if (escolha ==3) {

                System.out.println(c1.Multiplicacao(num1, num2));

            }
            else if(escolha == 4) {

                System.out.println(c1.Divisao(num1, num2));
                System.out.println(c1.resto(num1, num2));
            }
            else {

                System.err.println("ERRO");

            }

        sc.close();
    }


}