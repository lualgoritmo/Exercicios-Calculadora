import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário");
        double salario = sc.nextDouble();
        double reajuste = 0.07;
        double resultado = salario * reajuste;
        System.out.println(resultado);
        double soma = 0;
        double total = salario + resultado;
        System.out.println("Salário com Reajuste: " + total);
    }
}
