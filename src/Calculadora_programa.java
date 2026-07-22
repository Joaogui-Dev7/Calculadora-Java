import java.util.Scanner;

public class Calculadora_programa
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Qual operação deseja fazer(+, -, /, *)? ");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        float result;

        switch (operacao)
        {
            case '+':
                System.out.println("Soma bizarra");

                result = soma(num1, num2);
                System.out.println(result);

                break;

            case '-':
                System.out.println("subtração bizarra");

                result = sub(num1, num2);
                System.out.println(result);

                break;

            case '/':
                System.out.println("divisão bizarra");

                result = div(num1, num2);
                System.out.println(result);

                break;

            case '*':
                System.out.println("multiplicação bizarra");

                result = mult(num1, num2);
                System.out.println(result);

                break;
        }
    }



    public static float soma(int a, int b)
    {
        return (float) a + b;
    }

    public static float sub(int a, int b)
    {
        return (float) a - b;
    }

    public static float div(int a, int b)
    {
        return (float) a / b;
    }

    public static float mult(int a, int b)
    {
        return (float) a * b;
    }
}
