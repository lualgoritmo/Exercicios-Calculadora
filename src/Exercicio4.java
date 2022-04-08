import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número X e Y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int resultado = x * y;
        System.out.println("Resultado: " + resultado);
    }
}
