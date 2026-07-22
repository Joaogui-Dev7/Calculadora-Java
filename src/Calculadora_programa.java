import java.util.Scanner;

public class Calculadora_programa
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("Qual operação deseja fazer(+, -, /, *)? ");
        char operação = scanner.next().charAt(0);

        switch operação
        {
            case +:

        }
    }


    public static int soma(int num1, int num2)
    {
        int resultado_soma1 = num1+ num2;

        return resultado_soma1;
    }

    public static int sub(int num1, int num2)
    {
        int resultado_sub1 = num1 - num2;

        return resultado_sub1;
    }
}
