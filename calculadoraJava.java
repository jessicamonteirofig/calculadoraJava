import java.util.Scanner;

public class calculadoraJava {

        public static void main(String[] args) {

            double num1;
            double num2;
            double resultado;
            char operacao;

            Scanner inputReader = new Scanner(System.in);

            System.out.println("Olá, bem vindo a calculadora! Escolha uma operação (+, -, *, /): ");
            operacao = inputReader.next().charAt(0);
            System.out.println("Digite o primeiro numero: ");
            num1 = inputReader.nextDouble();
            System.out.println("Digite o segundo numero: ");
            num2 = inputReader.nextDouble();

            switch (operacao){
                case '+': resultado = num1 + num2;
                    break;
                case '-': resultado = num1 - num2;
                    break;
                case '*': resultado = num1 * num2;
                    break;
                case '/': resultado = num1/num2;
                    break;

                default:
                    System.out.println("Escolha uma operação válida!");
                    return;
            }
            System.out.println("O resultado da operação é: " + num1 + " " + operacao + " " + num2 + "" +
                    " = " + resultado);
        }
    }

